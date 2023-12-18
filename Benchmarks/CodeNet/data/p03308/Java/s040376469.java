import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] A = new int[N];

	for(int i = 0; i < N; i++){
	    A[i] = scan.nextInt();
	}

	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;

	for(int i = 0; i < N; i++){
	    if(A[i] < min){
		min = A[i];
	    }
	    if(A[i] > max){
		max = A[i];
	    }
	}

	System.out.println(max-min);
    }
}
