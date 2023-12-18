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
//		new A().doIt();
		new B().doIt();
//		new C().doIt();
//		new D().doIt();
	}
	class A{
		void doIt() {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int ans = 0;
			if(N <= K)ans = X*N;
			else ans = X*K + Y*(N - K);
			System.out.println(ans);
		}
	}
	class B{
		void doIt() {
			String str = sc.next();
			char ctr[] = str.toCharArray();
			int alf[] = new int [256];
			for(int i = 0;i < str.length();i++) {
				alf[ctr[i]]++;
			}
			System.out.println(check(alf));
		}
		String check(int alf[]) {
			for(char c = 'a';c <= 'z';c++) {
				if(alf[c] % 2 == 1)return "No";
			}
			return "Yes";
		}
	}
	class C{
		
	}
	class D{
		
	}
}
