import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] a = new String[n];
		Map<String,StringBuilder> map = new HashMap<String,StringBuilder>();

		for (int i=0; i<n; i++) {
			a[i] = br.readLine();
			String num = a[i].substring(2);

			StringBuilder mark = new StringBuilder();
			mark.append(a[i].substring(0,1));

			if (map.containsKey(num)) {
				map.put(num,map.get(num).append(mark));
			}else {
				map.put(num,mark);
			}
		}

		quickSort(a,0,n-1);

		boolean flag = true;
		int index = 0;
		while (index < a.length) {
			StringBuilder marks = new StringBuilder();
			marks.append(map.get(a[index].substring(2)));

			StringBuilder str = new StringBuilder();
			for (int j=index; j < marks.length()+index; j++) {
				str.append(a[j].substring(0,1));
			}

			if (!str.toString().contentEquals(marks)) {
				System.out.println("Not stable");
				flag = false;
				break;
			}
			index += marks.length();
		}
		if(flag){
			System.out.println("Stable");
		}


		for (int i=0; i<n; i++) {
			System.out.println(a[i]);
		}


		br.close();
	}

	static int partition(String[] a,int p,int r) {
		int x = Integer.parseInt(a[r].substring(2));
		int i = p-1;
		for (int j=p; j<r; j++) {
			if (Integer.parseInt(a[j].substring(2)) <= x) {
				i = i+1;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		return i+1;
	}

	static void quickSort(String[] a,int p,int r){
		if (p < r) {
			int q = partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
		}
	}

    static void swap(String[] a,int idx1,int idx2){
        String temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}