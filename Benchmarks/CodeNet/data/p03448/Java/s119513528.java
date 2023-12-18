import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int tot = 0;
		int ans = 0;

//		System.out.println("a "+a);
//		System.out.println("b "+b);
//		System.out.println("c "+c);
//		System.out.println("x "+x);
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				for (int k = 0; k <= c; k++) {
					tot = i * 500 + j *100 + k * 50;
					if (tot == x) {
//						System.out.print(" i "+i);
//						System.out.print(" j "+j);
//						System.out.println(" k "+k);
//						System.out.println(tot);
						ans ++;
					}
				}
			}
			
		}
		System.out.println(ans);
	}
}
