import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long H = sc.nextLong();
	long W = sc.nextLong();
	long count = 0;
	if(H%2==0){
	    for(int i=0;i<W;i++){
		count += H/2;
	    }
	}else if(H==1){
	    if(W%2==0) count=W/2;
	    else count=(W/2)+1;
	}else if(H%2==1){
	    for(int i=1;i<=W;i++){
		if(i%2==1) count += (H/2)+1;
		else count += H/2;
	    }
	}
	System.out.print(count);
    }
}
