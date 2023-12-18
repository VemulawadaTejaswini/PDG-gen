import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		boolean yes = false;
;
		if(cal(a,c) <= d){
			yes = true;
		}

		if(cal(b,c) <= d && cal(a,b) <=d){
			yes = true;
		}

		if(yes){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

	public static int cal(int i, int n){
		int num = 0;
		if(i >= n){
			num = i - n;
		}else{
			num = n-i;
		}
		return num;
	}
}
