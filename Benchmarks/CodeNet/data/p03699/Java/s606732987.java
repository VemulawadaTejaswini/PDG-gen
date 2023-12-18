import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S[] = new int[N];

		int goukei = 0;
		int min = 1000;
		for(int i=0;i<N;i++) {
			S[i]= sc.nextInt();
			goukei += S[i];
			if(S[i]%10!=0 && S[i]<min) {
				min = S[i];
			}
		}

		if(min == 1000) {
			System.out.println(0);
		}else if(goukei%10!=0){
			System.out.println(goukei);
		}else {
			System.out.println(goukei-min);
		}


		List<Integer> foo = new ArrayList<Integer>();
	}

}
