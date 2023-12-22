import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int ans = 0;
		if(N >= 100){
			ans = N % 100;
		}
		else if(N >= 10){
			ans = N % 10;
		}
		else{
			ans = N;
		}

		if(ans == 2 || ans == 4 || ans == 5 || ans == 7 || ans == 9){
			System.out.println("hon");
		}
		else if(ans == 0 || ans == 1 || ans == 6 || ans == 8){
			System.out.println("pon");
		}
		else{
			System.out.println("bon");
		}
		stdIn.close();
	}
}