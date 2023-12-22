import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a,b,tmp;
        String op;
    	while(true){
	    	a = scan.nextInt();
	    	op = scan.next();
	    	b = scan.nextInt();
	    	if(op.equals("?")) break;
	    	System.out.println(solve(a,b,op));
    	}
    }
    
    public static int solve(int a,int b,String op){
    	if(op.equals("+")) return (a+b);
    	if(op.equals("-")) return (a-b);
    	if(op.equals("*")) return (a*b);
    	if(op.equals("/")) return (a/b);
    	return 1;
     }
}