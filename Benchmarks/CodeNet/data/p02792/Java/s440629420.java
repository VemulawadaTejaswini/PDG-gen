import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long ans = 0;
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= 9;j++)
				ans += handstand(i,j,n)*handstand(j,i,n);
		}
		
		System.out.println(ans);

	}


	static int handstand(int l, int r, int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			if(i%10 == l && Integer.parseInt(String.valueOf(i).substring(0, 1)) == r )
				sum++;
		}
		return sum;

	}
}