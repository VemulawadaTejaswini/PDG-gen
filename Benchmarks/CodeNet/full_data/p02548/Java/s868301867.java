import java.util.Scanner;

public class Main {
	static long count(int AB){
		int ret = 0;
		for(int a = 1 ; a * a <= AB ; ++a){
			if(AB % a == 0){
				int b = AB / a;
				if(a == b){
					++ret;
				}else{
					ret += 2;
				}
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ret = 0;
		int AB[] = new int[N + 1];
		for(int A = 1 ; A <= N ; ++A){
			for(int ab = A ; ab <= N ; ab += A){
				AB[ab]++;
			}
		}
//		long ts = System.currentTimeMillis();
		for(int C = 1 ; C <= N ; ++C){
			int ab = N - C;
			ret += AB[ab];
		}
//		long te = System.currentTimeMillis();
//		System.out.println(te - ts);
		System.out.println(ret);
	}
}
