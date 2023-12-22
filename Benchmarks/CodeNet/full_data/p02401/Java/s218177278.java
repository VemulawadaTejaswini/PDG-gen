import java.util.Scanner;
import java.io.*;
class Main{
    public static void main(String[] av)throws IOException{
	Scanner sc=new Scanner(System.in);

     
	while(true){
	    int a=sc.nextInt();
	    String op=sc.next();
	    int b=sc.nextInt();
	    if(op.equals("+"))		System.out.println(a+b);
	    if(op.equals("-"))		System.out.println(a-b);
	    if(op.equals("*"))		System.out.println(a*b);
	    if(op.equals("/"))		System.out.println(a/b);
	    if(op.equals("?"))		break;
	       
	
	}

    
    
    }
}

