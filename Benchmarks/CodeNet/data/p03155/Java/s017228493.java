import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n=sc.nextInt(),h=sc.nextInt(),w=sc.nextInt();
		System.out.println((int)(Math.ceil(n/w)*Math.ceil(n/h)));
	}
}

