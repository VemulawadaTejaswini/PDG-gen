
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum=0;
		int s=1;

		for(int i=0; i<18; i++){
			s*=10;
		}

		for(int i=0; i<N; i++){
			Long A = sc.nextLong();
			sum*=A;
		}

		if(sum >= s){
			sum = -1;
		}

		System.out.println(sum);
	}

}
