import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans  = 0;
		if(A>B&&A-B>1){
			ans = A + A - 1;
		}else if(B>A&&B-A>1){
			ans = B + B - 1;
		}else{
			ans = A + B;
		}
		System.out.println(ans);
	}

}