import java.util.Scanner;

public class A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		String output = (a >= 3200) ? s : "red";
		System.out.println(output);
	}
}