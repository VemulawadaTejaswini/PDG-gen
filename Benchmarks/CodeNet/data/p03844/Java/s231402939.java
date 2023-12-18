import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	String op = scan.next();
	int b = scan.nextInt();

	if(op.charAt(0) == '+'){
	    System.out.println(a+b);
	}else{
	    System.out.println(a-b);
	}
    }
}
