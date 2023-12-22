import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String strArray[] = str.split(" ");
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		System.out.println((a*b) +" "+ 2*(a+b));
	}
}