import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
			if(str.equals("END OF INPUT")) break;
			String [] a = str.split(" ");
			for(String ss:a) {
				System.out.print(ss.length());
			}
			System.out.println();
		}
	}
}

