
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static List <Integer>[] Edge;
	static int [][]d;
	static boolean []visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		Edge = new ArrayList [n];
		
		for(int i = 0 ; i< n ;i++) {
			Edge[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0 ; i < n-1 ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			Edge[a-1].add(b-1);
			Edge[b-1].add(a-1);
		}
		d = new int [n][2];
		visit = new boolean [n];
		DFS(0,0);
		visit = new boolean [n];
		DFS(n-1,1);
		
		int fe = 1;
		int snu = 1;
		int p = 0;
		
		for(int i = 1 ; i < n-1 ;i++) {
			if(d[i][0] < d[i][1]) {
				fe++;
			}
			else if(d[i][0] > d[i][1]) {
				snu++;
			}
			else {
				if(p % 2 == 0) {
					fe++;
				}
				else {
					snu++;
				}
				p++;
			}
		}
		
		if(snu > fe) {
			System.out.println("Snuke");
		}
		else {
			System.out.println("Fennec");
		}
		
		
		
		
	}
	
	static void DFS(int st , int id) {
		
		visit[st] = true;
		for(int num : Edge[st]) {
			if(!visit[num]) {
			d[num][id] = d[st][id] + 1;
			DFS(num,id);
			}
		}
	
	}
	
}