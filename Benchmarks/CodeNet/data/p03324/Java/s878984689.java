import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int tmp = (int) (Math.pow(100, d) * n);
		System.out.println(tmp);
	}
}
