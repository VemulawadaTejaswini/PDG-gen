import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		while(i*i<n){
			i++;
		}
		i--;
		System.out.println(i*i);
	}
}