import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b) {
		if (b < c) {
		System.out.printf("%d %d %d", a, b, c);
		} else if (a < c) {
			System.out.printf("%d %d %d",a, c, b);
		}else{
			System.out.printf("%d %d %d",c, a, b);
		}}else {
			if(a < c){
				System.out.printf("%d %d %d",b, a, c);
		
		} else if(b < c){
			System.out.printf("%d %d %d",b, c, a);
		}else{
			System.out.printf("%d %d %d",c, b, a);
		}
		}}}