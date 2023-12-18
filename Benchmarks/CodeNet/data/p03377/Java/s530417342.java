import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int X = stdIn.nextInt();
	if(A>X){
	    System.out.println("No");
	}else if(X<B){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
