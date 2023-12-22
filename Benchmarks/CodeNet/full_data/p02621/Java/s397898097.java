import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		Integer result = num + num * num + num * num * num;
		System.out.println(result);
	}
}
