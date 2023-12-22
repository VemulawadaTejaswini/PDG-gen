import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int a = stdin.nextInt();
	  String op = stdin.nextLine();
	  int b = stdin.nextInt();
	int i = 3;
	while(!(op.equals("?"))){
	    if(op.equals("+")){
		System.out.println(a+b);}
	    else if(op.equals("-")){
		System.out.println(a-b);}
	    else if(op.equals("*")){
		System.out.println(a*b);}
	    else if(op.equals("/")){
		System.out.println(a/b);}
	    else{}
	    a = stdin.nextInt();
	      op = stdin.nextLine();
	      b = stdin.nextInt();
	      i = i+3;
	}
    }
}