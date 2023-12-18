import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
String s =sc.next();
boolean b =true;
if(s.charAt(0)==s.charAt(1)&&s.charAt(1)==s.charAt(2)){
	System.out.println("No");
}
else{
	System.out.println("Yes");
}
	}

}
