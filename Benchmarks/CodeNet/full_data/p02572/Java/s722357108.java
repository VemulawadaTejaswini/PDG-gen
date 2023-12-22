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
			long A[] = new long[N];
			long MOD = 1000000007;
			for(int i = 0;i < N;i++) {
				A[i] = Long.parseLong(sc.next());
			}
			long ans = 0;
			for(int i = 0;i < N;i++) {
				for(int j = i + 1;j < N;j++) {
//					System.out.println(A[i]+" "+A[j]);
					ans = (ans + A[i]*A[j]) % MOD;
				}
			}
			System.out.println(ans);
		}
	}
}