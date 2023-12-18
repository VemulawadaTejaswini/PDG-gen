import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String x = scan.next();
	String y = scan.next();

	if(x.charAt(0) >= y.charAt(0)){
	    System.out.println(x.charAt(0)-55);
	}else if(x.charAt(0) < y.charAt(0)){
	    System.out.println(y.charAt(0)-55);
	}
    }
}
