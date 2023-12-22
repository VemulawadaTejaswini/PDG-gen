import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		int i = 1, num;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		while(num != 0){
			System.out.println("Case " + i + ": " + num);
			num = sc.nextInt();
			i++;
		}
	}
}
