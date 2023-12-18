import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s1 = scan.next();
	String s2 = scan.next();
	String s3 = scan.next();

	System.out.println((char)(s1.charAt(0)-32)+""+
			   (char)(s2.charAt(0)-32)+""+
			   (char)(s3.charAt(0)-32));
    }
}
