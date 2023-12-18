import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
		if(culcDifference(a, c) > d) {
			if(culcDifference(a, b) > d || culcDifference(c, b) > d ) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	
	public static int culcDifference(int a,int b) {
		if(a > b) return a-b;
		else return b-a;
	}
}

