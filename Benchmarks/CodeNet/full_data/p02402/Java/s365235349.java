import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int M=0,m=0;
		long S = 0;
		
		for(int i = 0;i <= n;i++){
			int x = sc.nextInt();
			M = Math.max(M,x);
			m = Math.min(m,x);
			S = S+x;
		}
		System.out.print(m+" "+M+" "+S);
	}
}