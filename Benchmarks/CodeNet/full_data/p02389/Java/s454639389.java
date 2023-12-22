import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();

		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);

		int s = ai * bi;
		int l = 2*(ai + bi);

		System.out.println(s + " " + l);
		
		
	}
}