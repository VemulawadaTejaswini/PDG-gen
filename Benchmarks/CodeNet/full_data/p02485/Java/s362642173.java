import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		while(true){
			int x = sc.nextInt();
			if (x == 0)
				break;
			int sum = 0;
			while (x >= 1){
				sum += x % 10;
				x /= 10;
			}
			System.out.println(sum);
		}
	}
}