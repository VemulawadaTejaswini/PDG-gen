import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int p = scan.nextInt();
		int b = 3*a+p;
		System.out.println(b/2);
	}

}