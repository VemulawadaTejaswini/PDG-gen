import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	long K = sc.nextLong();
	int[] A = new int[N];

	int count = 0;
	for(int i=0;i<N;i++){
	    A[i] = sc.nextInt();
	    if(A[i] == i+1) count++;
	}
       
	K = K%(N-count);
	
	int nowst = 1;
	for(int i=0;i<K;i++){
	    nowst = A[nowst-1];
	}
	System.out.print(nowst);
    }
}
