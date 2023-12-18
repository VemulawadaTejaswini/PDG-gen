import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        long N = scan.nextInt();
        long K = scan.nextInt();
        int [] A = new int [100001];
        Arrays.fill(A, 0);
        long sum = 0;
        for(int i=0;i<N;i++){
        	int a = scan.nextInt();
        	int B = scan.nextInt();
        	A[a] += B; 
        }
        for(int i=0;i<10001;i++){
        	sum +=A[i];
        	if(sum>=K){
        		System.out.println(i);
        		break;
        	}
        }
	}

}
