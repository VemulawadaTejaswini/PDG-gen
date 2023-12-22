import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];

		String s = br.readLine();
		String[] str = s.split(" ");
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		int p = partition(a,0,n-1);

		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n-1; i++) {
			if(i != p){
				sb.append(a[i]).append(" ");
			}else {
				sb.append("[").append(a[i]).append("] ");
			}
		}
		if (n-1 != p) {
			System.out.println(sb.append(a[n-1]));
		}else {
			System.out.println(sb.append("[").append(a[n-1]).append("]"));
		}

		br.close();
	}

	static int partition(int[] a,int p,int r) {
		int x = a[r];
		int i = p-1;
		for (int j=p; j<r; j++) {
			if (a[j] <= x) {
				i = i+1;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		return i+1;
	}

    static void swap(int[] a,int idx1,int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}