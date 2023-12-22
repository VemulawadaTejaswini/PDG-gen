import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int p;
		while((p = sc.nextInt()) != 0){
			sum -= p;
		}
		System.out.println(sum);
	}
}