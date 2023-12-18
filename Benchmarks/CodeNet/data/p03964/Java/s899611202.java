import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new ABC045().doIt(); //DFS
		new ABC046().doIt();
	}
	class ABC045{
		long ans = 0;
		void doIt(){
			String str = sc.next();
			int length = str.length();
			dfs(str,length,0,0);
			System.out.println(ans);
		}
		void dfs(String str,int length,int Pos,long sum) {
			for(int i = Pos+1;i <= length;i++) {
				long num = Long.parseLong(str.substring(Pos, i));
				dfs(str,length,i,sum + num);
			}
			if(Pos == length) {
				ans = ans + sum;
			}
		}
	}
	class ABC046{
		void doIt(){
			int n = sc.nextInt();
			long T = 1;
			long A = 1;
			for(int i = 0;i < n;i++) {
				long Tn = sc.nextLong();
				long An = sc.nextLong();
				
				long subA = A / An;
				long subT = T / Tn;
				if(A % An > 0)subA++;
				if(T % Tn > 0)subT++;
				A = Math.max(subA, subT)*An;
				T = Math.max(subA, subT)*Tn;
				
			}
			long ans = T + A;
			System.out.println(ans);
		}
	}
}
