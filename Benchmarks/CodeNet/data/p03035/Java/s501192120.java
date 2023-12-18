import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	if(A<13&&A>5){
	    B/=2;
	}else if(A<6){
	    B=0;
	}
	System.out.println(B);
    }
}
		
