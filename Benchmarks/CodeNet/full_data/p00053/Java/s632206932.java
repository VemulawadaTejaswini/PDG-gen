



import java.io.PrintWriter;
import java.util.Scanner;




public class Main {




	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);




	static boolean[] prime = new boolean[10001];




	public static void main(String[] args) {
		ersis();
		while(true){
			int n = si();
			if(n==0) break;




			int cnt = 0,sum = 0;
			for (int i = 0; i <=10000; i++) {
				if(!prime[i]){
					sum+=i;
					cnt++;
					if(cnt==n) break;
				}
			}
			out.println(sum);
		}
		out.flush();
	}




	static void ersis(){
		prime[0]=prime[1]=true;
		for (int i = 0; i*i < 10000 ; i++) {
			if(!prime[i])
				for (int j = i*2; j <= 10000 ; j+=i) {
					prime[j]=true;
				}
		}
	}




	static int si() {
		return Integer.parseInt(scan.next());
	}
}