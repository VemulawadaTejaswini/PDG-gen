import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StringBuilder text = new StringBuilder();
		scan.close();
		for(int i = 1;i <= n;i++){
			if(i % 3 == 0){
				text.append(" ").append(i);
			}
		}
		System.out.println(text.toString());
	}
}