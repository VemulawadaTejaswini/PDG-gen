import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
		if(b<c || a>d) {
			System.out.println(0);
		}else if(c<=a && b<=d) {
			System.out.println(b-a);
		}else if(c<=b) {
			System.out.println(Math.min(b,d)-c);
		}else if(a<=d) {
			System.out.println(d-Math.max(a, c));
		}
	}
	public static int sample() {
		return 1;
	}

}
