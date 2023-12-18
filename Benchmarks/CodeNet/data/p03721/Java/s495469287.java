import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        long N = scan.nextInt();
        long K = scan.nextInt();
        long [] A = new long [100001];
        Arrays.fill(A, 0);
        long sum = 0;
        for(int i=0;i<N;i++){
        	int a = scan.nextInt();
        	long B = scan.nextLong();
        	A[a] += B; 
        }
        for(int i=0;i<100001;i++){
        	sum +=A[i];
        	if(sum>=K){
        		System.out.println(i);
        		break;
        	}
        }
	}

}
