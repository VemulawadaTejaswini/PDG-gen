import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		String answer = new String();
		if(a < b && b < c)
			answer = "Yes";
		else
			answer = "No";
		System.out.println(answer);
	}

}