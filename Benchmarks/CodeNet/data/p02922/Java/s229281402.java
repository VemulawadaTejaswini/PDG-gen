import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int ans = 0;
		ans = B / A;
		if(A <= B){
			if(B % A == 0){
				System.out.println(ans);
			}
			else{
				ans++;
				System.out.println(ans);
			}
		}
		else{
			System.out.println(B);
		}
		stdIn.close();
	}
}