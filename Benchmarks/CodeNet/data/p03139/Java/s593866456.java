import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
		int max = Math.min(a, b);
		int min=0;
		if(n<a+b) {
			min = a+b-n;
		}
		System.out.println(max + " " +min);
	}
	public static int floor(int n) {
		return (int)Math.floor((n*n + 4.0)/8.0);
	}

}
