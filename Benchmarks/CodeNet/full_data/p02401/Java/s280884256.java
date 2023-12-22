import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int a,b;
	String op;
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
	a=scan.nextInt();
	op=scan.next();
	b=scan.nextInt();
	if(op.equals("?"))break;
	else if(op.equals("+"))
	    System.out.println(a+b);
	else if(op.equals("-"))
	    System.out.println(a-b);
	else if(op.equals("*"))
	    System.out.println(a*b);
	else if(op.equals("/"))
	    System.out.println(a/b);
	    }
    }
}