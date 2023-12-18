import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int ans = 0;
		ans = B / A;
		if(B % A == 0){
			System.out.println(ans);
		}
		else if(A % B == 0){
			System.out.println(0);
		}
		else{
			ans++;
			System.out.println(ans);
		}
		stdIn.close();
	}
}
