import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		double n=sc.nextInt(),k=sc.nextInt();
		if(Math.ceil(n/2)<k) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}