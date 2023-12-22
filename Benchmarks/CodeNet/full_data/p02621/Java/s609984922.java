import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int K=scan.nextInt();
		int A[]=new int[N];
		int B[]=new int[M];
		for(int i=0;i<A.length;i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0;i<B.length;i++) {
			B[i]=scan.nextInt();
		}
		int len=A.length+B.length;
		int []hoge=new int[len];
		System.arraycopy(A,0,hoge,0,A.length);
		System.arraycopy(B,0,hoge,A.length,B.length);
		
		Arrays.sort(hoge);
		System.out.println();
		int sum=0;
		for(int i=0;i<len;i++) {
				if(K-hoge[i]>=0) {
					K-=hoge[i];
					sum+=1;
					}else {
					break;
				}
		}
		
		System.out.println(sum);

	}
}
