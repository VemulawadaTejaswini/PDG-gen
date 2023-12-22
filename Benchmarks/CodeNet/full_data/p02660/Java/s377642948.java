import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
	
        int count = 0;
        for(int i=2;i<=N;i++){
	    if(N/i <= 0) break;
	    if(N%i==0 || N==i){
		count++;
		N = N/i;
	    }
	}
	System.out.print(count);
    }
}
