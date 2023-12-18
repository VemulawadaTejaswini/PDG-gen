import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		int count = 0;
		if(a != b){
			count++;
		}
		if(b != c){
			count++;
		}
		if(c != a){
			count++;
		}
		System.out.println(count);
	}

}
