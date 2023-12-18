import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long N = sc.nextLong();
	long K = sc.nextLong();
	long min = N;
	for(int i=0;i<=N/K+1;i++){
	    N = Math.abs(N-K);
	    if(N < min) min=N;
	}
	System.out.print(min);
    }
}
