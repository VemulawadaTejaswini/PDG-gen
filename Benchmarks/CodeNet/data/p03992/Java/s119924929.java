import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		System.out.println(a.substring(0,4)+" "+a.substring(4,12));
		}
}