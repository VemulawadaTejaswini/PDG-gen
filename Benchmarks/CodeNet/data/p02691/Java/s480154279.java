import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int[] A = new int[N];
	for(int i=0;i<N;i++){
	    A[i] = sc.nextInt();
	}
	int count=0;

	for(int hito=0;hito<=N-3;hito++){
	    for(int futa=hito+2;futa<=N-1;futa++){
		if(Math.abs(A[futa]+A[hito]) == futa-hito){
		    count++;
		}
	    }
	}
	System.out.print(count);
    }
}
