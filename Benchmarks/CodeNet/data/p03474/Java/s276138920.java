import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String postCode = sc.next();
		int index = postCode.indexOf("-");
		if(x == index && y == postCode.length() - index - 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
