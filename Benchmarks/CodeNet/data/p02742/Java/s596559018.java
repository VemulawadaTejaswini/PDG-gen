import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long H = sc.nextLong();
	long W = sc.nextLong();
	long count=0L;
	if(H%2==0L){
	    count = H/2 * W;
	}else if(H%2==1L){
	    count = H * (W/2);
	    if(W%2==1L){
	    	count += H/2 +1;
	    }
	}
	System.out.print(count);
    }
}
