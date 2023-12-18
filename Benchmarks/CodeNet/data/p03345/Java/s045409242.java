import java.util.Scanner;
public class Main {
	int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}
	int N;

	void test(Scanner sc){
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long ans = -1;
		if(K%2==1){
			if(Math.abs(B-A) <= Math.pow(10, 18)){
				ans = B-A;
				System.out.println(ans);
				return;				
			}
		}else{
			if(Math.abs(A-B) <= Math.pow(10, 18)){
				ans = A-B;
				System.out.println(ans);
				return;
			}
		}

		System.out.println("Unfair");
	}
}
