
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A=new int[N];
		for(int i=0; i<N; i++) {A[i]=0;}
		for(int i=0; i<N; i++) {A[i]=sc.nextInt();}
		int min=-1,max=0;
		for(int i=0; i<N; i++) {
			if(min==-1||A[i]<min)min=A[i];
			if(A[i]>max)max=A[i];
		}
		int msum=-1;
		for(int b=min-N; b<max+N; b++) {
			int sum=0;
			for(int i=0; i<N; i++) {sum+=Math.abs(A[i]-(b+i+1));}
			if(msum==-1||sum<msum)msum=sum;
		}
		System.out.println((msum));
	}
}