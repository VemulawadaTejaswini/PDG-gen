import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        int A[] = new int[N];

        for(int i=0;i<N;i++) {
        	A[i] = stdin.nextInt();
        }
        for(int i=1;i<=N;i++) {
        	for(int j=0;j<N;j++) {
        		if(i == A[j]) {
        			System.out.printf("%d ",j+1);
        			break;
        		}
        	}
        }
    }
}
