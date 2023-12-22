import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static int[] first;
	static int [] end;
	static List[] arLs;

	static int dfs(int cur,int ts) {
		first[cur] = first[cur]==0 ? ts : first[cur];
		int now = ts+1;
		for(int i=0;i<arLs[cur].size();i++) {
			int a = (Integer)arLs[cur].get(i);
			if (first[a]==0){
				now = dfs(a, now);
			}
		}
		end[cur] = end[cur]==0 ? now : end[cur];
		return now+1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		arLs = new List[n];
		first = new int[n];
		end = new int[n];
		for (int i=0;i<n;i++) {
			List<Integer> ls = new ArrayList<Integer>();
			scan.nextInt();
			int np = scan.nextInt();
			for (int j=0;j<np;j++) {
				ls.add(scan.nextInt()-1);
			}
			arLs[i] = ls;
		}
		dfs(0,1);
		for (int i=0;i<n;i++) {
			System.out.println(i+1+" "+first[i]+" "+end[i]);
		}
	}
}