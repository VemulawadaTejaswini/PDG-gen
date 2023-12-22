import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(n == 0 && w == 0 && d == 0)break;
			else calc(n, w, d);
			
		}
	}
	public void calc(int n, int w, int d){
		//最終的にnピースできる
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[]{w, d});
		for(int i = 0; i < n; i++){
			int p = sc.nextInt();
			int s = sc.nextInt();
			
			int[] peace = list.get(p-1);
			list.remove(p-1);
			
			int nw = 0;
			int nd = 0;
			
			while(true){
				if(s < peace[0]) {
					nw = s;
					break;
				}
				else s -= peace[0];
				
				if(s < peace[1]){
					nd = s;
					break;
				}
				else s -= peace[1];
			}
			
			if(nw == 0){
				int nd2 = peace[1] - nd;
				if(nd < nd2){
					list.add(new int[]{peace[0], nd});
					list.add(new int[]{peace[0], nd2});
				}
				else{
					list.add(new int[]{peace[0], nd2});
					list.add(new int[]{peace[0], nd});
				}
			}
			else{
				int nw2 = peace[0] - nw;
				if(nw < nw2){
					list.add(new int[]{nw, peace[1]});
					list.add(new int[]{nw2, peace[1]});
				}
				else{
					list.add(new int[]{nw2, peace[1]});
					list.add(new int[]{nw, peace[1]});
				}
			}
		}
		
		list = mergesort(list);
		for(int i = 0; i < list.size(); i++){
			if(i != 0) System.out.print(" ");
			System.out.print(list.get(i)[0] * list.get(i)[1]);
		}
		System.out.println();
	}

	public ArrayList<int[]> mergesort(ArrayList<int[]> list){
		if(list.size() > 1){
			int n = list.size() / 2;
			int m = list.size() - n;
			ArrayList<int[]> a1 = new ArrayList<int[]>();
			ArrayList<int[]> a2 = new ArrayList<int[]>();
			for(int i = 0; i < n; i++) a1.add(list.get(i));
			for(int i = 0; i < m; i++) a2.add(list.get(i + n));

			a1 = mergesort(a1);
			a2 = mergesort(a2);
			return merge(a1, a2);
			
		}
		else return list;
	}
	
	public ArrayList<int[]> merge(ArrayList<int[]> a1, ArrayList<int[]> a2){
		int i = 0;
		int j = 0;
		ArrayList<int[]> a = new ArrayList<int[]>();
		while(i < a1.size() || j < a2.size()){
			if(j >= a2.size() || (i < a1.size() && a1.get(i)[0] * a1.get(i)[1] < a2.get(j)[0] * a2.get(j)[1])){
				a.add(a1.get(i));
				i++;
			}
			else {
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