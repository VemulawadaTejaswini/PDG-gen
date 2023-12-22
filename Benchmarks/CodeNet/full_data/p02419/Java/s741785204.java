import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine().toLowerCase();
		int count = 0;
		
		while(scanner.hasNext()){
		String str = scanner.nextLine().toLowerCase();
		if(str.contains(ans)){
			count++;
		}
		}
		System.out.println(count);
	}
}