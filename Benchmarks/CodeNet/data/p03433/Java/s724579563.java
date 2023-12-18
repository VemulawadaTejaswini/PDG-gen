import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int N = stdIn.nextInt();
	int A = stdIn.nextInt();
	int o = N%500;
	if(o<A){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
