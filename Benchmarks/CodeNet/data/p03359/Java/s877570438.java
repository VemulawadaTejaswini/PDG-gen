import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b < a)
			System.out.println(a-1);
		else
			System.out.println(a);
	}
}
