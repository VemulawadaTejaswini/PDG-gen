import java.awt.*;
import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestC().doIt();
	}
	class TestC{
		void doIt() {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int F[] = new int[N+1];
			int P[] = new int[N+1];
			int ans = 1;
			int par = 0;
			String s = "";
			for(int i = 0;i < N;i++) {
				P[i] = i;
			}
			for(int i = 0;i < M;i++) {
				int A = sc.nextInt() - 1;
				int B = sc.nextInt() - 1;
				if(F[A] == 0 && F[B] == 0) {
					par++;
					F[A] = par;
					F[B] = par;
				}else if(F[A] == F[B]) {
					continue;
				}else {
					int min = Math.min(F[A],F[B]);
					P[A] = min;
					P[B] = min;
				}
			}
			for(int i = 0;i < N;i++) {
				s = s+","+F[i];
			}
			for(int i = N-1;i >= 0;i--) {
				s = s.replaceAll(","+N, ","+P[N]);
			}
			
			int C[] = new int[N+1];
			String str[] = s.split(",");
			for(int i = 1;i < N;i++) {
				C[Integer.parseInt(str[i])]++;
				ans = Math.max(C[Integer.parseInt(str[i])], ans);
			}
			System.out.println(ans);
		}
	}
}