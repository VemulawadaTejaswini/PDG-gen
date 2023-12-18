import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
	String T = stdIn.next();
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	String U =stdIn.next();
	if(U.equals(S)){
	    A-=1;
	}else if(U.equals(T)){
	    B-=1;
	}
	System.out.println(A+" "+B);
    }
}
