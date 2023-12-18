import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int count = 0;
	if(N < 105){
	    count = 0;
	}else if(N ==105){
	    count = 1;
	}else if(N > 105){
	    for(int i=1;i<=N;i++){
		if(N%i==0)
		    count++;
	    }
	}
	System.out.print(count);
    }
}
