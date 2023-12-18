import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long K = scan.nextInt();
        int [] A = new int [N];
        int [] B = new int [N];
        long sum = 0;
        for(int i=0;i<N;i++){
        	A[i] = scan.nextInt();
        	B[i] = scan.nextInt();
        }
        for(int i=0;i<N;i++){
        	sum +=B[i];
        	if(sum>=K){
        		System.out.println(A[i]);
        		break;
        	}
        }
	}

}
