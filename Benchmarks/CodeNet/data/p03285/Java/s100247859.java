import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String ans = "No";

		for(int j =0; j <= N /4; j++)
			for(int k = 0; k <= N / 7; k++){
					if(4*j + 7*k == N) ans = "Yes";
			}

			System.out.println(ans);

	}
}