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
	    count = 1;
	    for(int j=107;j<=N;j+=2){
		int cc = 0;
		for(int i=1;i<=j;i+=2){
		    if(j%i==0) cc++;
		}
		if(cc==8) count++;
	    }
	}
	System.out.print(count);
    }
}
