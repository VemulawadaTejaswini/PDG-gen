import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			graph.add(new ArrayList<Integer>());
		}
		//int[] a = new int[m];
		//int[] b = new int[m];
		for(int i=0;i<m;i++){
			//a[i] = sc.nextInt();
			//b[i] = sc.nextInt();
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			ArrayList<Integer> list = graph.get(a);
			list.add(b);
			list = graph.get(b);
			list.add(a);
		}
		boolean judge = true;
		int ans = 0;
		while(judge){
			judge = false;
			for(int i=0;i<n;i++){
				ArrayList<Integer> list = graph.get(i);
				if(list.size()==1){
					judge = true;
					ans++;
					int k = list.get(0);
					list.remove(0);
					list = graph.get(k);
					for(int j=0;j<list.size();j++){
						if(list.get(j)==i){
							list.remove(j);
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}