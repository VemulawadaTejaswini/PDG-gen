import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = 0;
		int S = 0;
		for(int i = 0 ; i < N ; ++i){
			int A = sc.nextInt();
			if(A < H){
				S += H - A;
			}else{
				H = A;
			}
		}
		System.out.println(S);
	}
}
