
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		in.close();
		int[] mod = new int[k];
		int INF = 100000;
		for(int i=0;i<k;i++) {
			mod[i] = INF;
		}
		List<int[]> list = new LinkedList<>();
		int[] start = {1,1};
		list.add(0, start);
		while(mod[0]==INF) {
			int[] x = list.remove(0);
			mod[x[0]] = x[1];
			if(mod[(x[0]*10)%k]>mod[x[0]]) {
				int[] tmp = {(x[0]*10)%k,mod[x[0]]};
				list.add(0,tmp);
			}
			if(mod[(x[0]+1)%k]>mod[x[0]]+1) {
				int[] tmp = {(x[0]+1)%k,mod[x[0]]+1};
				list.add(list.size(),tmp);
			}
		}
		System.out.println(mod[0]);
		
	}
}