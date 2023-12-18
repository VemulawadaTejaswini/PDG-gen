import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static String a=sc.next();
	private static String b=sc.next();
	public static void main(String[] args){
		if((a.equals("H")&&b.equals("H"))||(a.equals("D")&&b.equals("D"))){
			System.out.println("H");
		}
		if((a.equals("H")&&b.equals("D"))||(a.equals("D")&&b.equals("H"))){
			System.out.println("D");
		}
	}
}