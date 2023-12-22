import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

int deposit = 100;
int i =0;

while(deposit < x) {
		deposit *= 1.01;
		i++;
}
			System.out.println(i);


	}

}
