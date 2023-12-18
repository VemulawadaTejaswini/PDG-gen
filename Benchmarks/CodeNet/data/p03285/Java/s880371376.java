import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String ans = "Yes";

		if(N <= 3) ans="No";

		for(int i = 4; i<N; i+=4){
			if(N%i == 0) {
				ans="Yes";
				break;}
			for(int j = 7; j<N; j+=7){
				if((N%j == 0) || (N%(i + j) == 0)){
					ans ="Yes";
					break;
				}
			}
			ans = "No";
		}

		for(int i = 7; i<N; i+=7){
			if(N%i == 0) {
				ans="Yes";
				break;}
			for(int j = 4; j<N; j+=4){
				if((N%j == 0) || (N%(i + j) == 0)){
					ans ="Yes";
					break;
				}
			}
			ans = "No";
		}

		if(N>=21) ans="Yes";
			System.out.println(ans);

	}
}