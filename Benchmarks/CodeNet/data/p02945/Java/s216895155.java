import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int ans1 = 0, ans2 = 0, ans3 = 0;
		int ans = 0;
		ans1 = A + B;
		ans2 = A - B;
		ans3 = A * B;
		if(ans1 >= ans2){
			if(ans1 >= ans3){
				ans = ans1;
			}
		}
		if(ans2 >= ans1){
			if(ans2 >= ans3){
				ans = ans2;
			}
		}
		if(ans3 >= ans1){
			if(ans3 >= ans2){
				ans = ans3;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}