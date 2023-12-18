import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(b <= c || d <= a) System.out.println(0);
		else if((c <= a && a <= d)) System.out.println(d-a);
		else if((c <= b && b <= d)) System.out.println(b-c);
		else if((c <= a && b <= d)) System.out.println(b-a);
		else if((a <= c && d <= b)) System.out.println(d-c);
		
	}
}