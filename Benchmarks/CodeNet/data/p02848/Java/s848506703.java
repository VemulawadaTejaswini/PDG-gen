
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String S=in.next();

String temp = S.substring(n);
String temp2=S.substring(0,n);
S=temp;
S+=temp2;
System.out.println(S);



	}

}
