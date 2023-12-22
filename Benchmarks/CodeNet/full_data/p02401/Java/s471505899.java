
import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String op=sc.nextLine();
	int b=sc.nextInt();
	while(true){
	    if(a==0 &&(op.equals("?"))&& b==0) break;
	    if(op.equals("+")) System.out.println((a+b));
	    else if(op.equals("-")) System.out.println((a-b));
	    else if(op.equals("*")) System.out.println((a*b));
	    else if(op.equals("/")) System.out.println((a/b));
	    else if(op.equals("%")) System.out.println((a%b));
	    a=sc.nextInt();
	    op=sc.nextLine();
	    b=sc.nextInt();	    

	}
    }
}