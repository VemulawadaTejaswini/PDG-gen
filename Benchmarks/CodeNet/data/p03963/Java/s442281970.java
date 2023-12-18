import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if (N>1){
			System.out.println(K*(int)(Math.pow(N-1, K-1)));
		}
		else if(N==1){
			System.out.println(K);
		}
	}

}