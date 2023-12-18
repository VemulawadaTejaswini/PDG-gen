import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] A = new int[N];
	int num = 0;
	for(int i=0;i<N;i++){
	    A[i]=sc.nextInt();
	    num += A[i];
	}
	
	int count = 0;
	for(int i=0;i<N;i++){
	    if(A[i] >= num/(4*M)) count++;
	}
	if(count >= M) System.out.print("Yes");
	else System.out.print("No");
    }
}
