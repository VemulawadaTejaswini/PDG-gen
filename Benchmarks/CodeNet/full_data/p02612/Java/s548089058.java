import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = 1000-a%1000;
			b = b==1000 ? 0:b;
			System.out.println(b);
	}	
}
