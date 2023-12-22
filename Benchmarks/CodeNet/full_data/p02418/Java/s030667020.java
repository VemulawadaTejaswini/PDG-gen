import java.util.Scanner;

//20180510
//06

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		String p = scanner.nextLine();
		scanner.close();

		String loop = s + s;

		if(loop.contains(p)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
    }
}
