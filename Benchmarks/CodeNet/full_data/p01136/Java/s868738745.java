import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		loop : while(true){
			int n = in.nextInt();
			boolean[][] sch = new boolean[31][n];
			for(int i=0;i<n;i++){
				int m = in.nextInt();
				for(int j=0;j<m;j++){
					sch[in.nextInt()][i] = true;
				}
			}
			int[] tag = new int[n];
			for(int i=1;i<=30;i++){
				int trans = i;
				for(int j=0;j<n;j++){
					if(sch[i][j]){
						if(tag[j]!=0){
							trans = Math.min(trans,tag[j]);
						}
						tag[j] = i;
					}
				}
				boolean fin = true;
				for(int j=0;j<n;j++){
					if(tag[j]==i) tag[j] = trans;
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