import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if(n == 0 && q == 0)break;
			else calc(n, q);
			
		}
	}
	public void calc(int n, int q){
		ArrayList<int[]> list = new ArrayList<int[]>();
;		String[] eras = new String[1001];
		
		int eranum = 1;
		for(int i = 0; i < n; i++){
			String eraname = sc.next();
			int erayear = sc.nextInt();
			int wesyear = sc.nextInt();
			eras[eranum] = eraname;
			
			list.add(new int[]{wesyear - erayear + 1, wesyear, eranum});
			eranum++;
		}
		
		list = mergeSort(list);
		
		for(int i = 0; i < q; i++){
			int wesyear = sc.nextInt();
			int ans = 0;
			for(int j = 0; j < list.size(); j++){
				int[] item = list.get(j);
				if(wesyear < item[0]){
					break;
				}
				else if(wesyear >= item[0] && wesyear <= item[1]){
					System.out.println(eras[item[2]] + " " + (wesyear - item[0] + 1));
					ans = 1;
					break;
				}
			}
			if(ans == 0) System.out.println("Unknown");
		}
	}
	public ArrayList<int[]> mergeSort(ArrayList<int[]> list){
		if(list.size() > 1){
			int m = list.size() / 2;
			int n = list.size() - m;
			ArrayList<int[]> a1 = new ArrayList<int[]>();
			ArrayList<int[]> a2 = new ArrayList<int[]>();
			for(int i = 0; i < m; i++) a1.add(list.get(i));
			for(int j = 0; j < n; j++) a2.add(list.get(j + m));
			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			return merge(a1, a2);
		}
		else return list;
	}

	public ArrayList<int[]> merge(ArrayList<int[]> a1, ArrayList<int[]> a2){
		int i = 0;
		int j = 0;
		ArrayList<int[]> a = new ArrayList<int[]>();
		while(i < a1.size() || j < a2.size()){
			if(i < a1.size() && (j >= a2.size() || a1.get(i)[0] < a2.get(j)[0])){
				a.add(a1.get(i));
				i++;
			}
			else{
				a.add(a2.get(j));
				j++;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}