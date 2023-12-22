import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if(a>=0 && c<=100){
		threeJudge(a, b, c);
		}
	}

	static void threeJudge(int a, int b, int c) {
			if (a < b && b < c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}