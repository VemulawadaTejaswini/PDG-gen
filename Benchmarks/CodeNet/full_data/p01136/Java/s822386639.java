
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		loop : while(true){
			int n = in.nextInt();
			if(n==0) break;
			boolean[][] sch = new boolean[31][n];
			for(int i=0;i<n;i++){
				int m = in.nextInt();
				for(int j=0;j<m;j++){
					sch[in.nextInt()][i] = true;
				}
			}
			int[] tag = new int[n];
			for(int i=1;i<=30;i++){
				HashMap<Integer,Integer> map = new HashMap<>();
				for(int j=0;j<n;j++){
					if(sch[i][j]){
						if(tag[j]!=0){
							map.put(tag[j],i);
						}
						tag[j] = i;
					}
				}
				boolean fin = true;
				for(int j=0;j<n;j++){
					if(map.containsKey(tag[j])) tag[j] = map.get(tag[j]);
					if(j!=0 && tag[j]!=tag[j-1]) fin = false;
				}
				if(fin){
					System.out.println(i);
					continue loop;
				}
			}
			System.out.println(-1);
		}
	}
}