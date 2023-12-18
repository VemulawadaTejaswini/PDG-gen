
import java.util.Scanner;
public class Main{
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
		int msum=motome2(0,A,N);
		System.out.println((msum));
	}
	static int motome(int b,int[] A,int N) {
		int sum=0;
		for(int i=0; i<N; i++) {sum+=Math.abs(A[i]-(b+i+1));}
		return sum;
	}
	static int motome2(int b,int[] A,int N) {
		int sum=motome(b,A,N);
		if(sum>motome(b+1,A,N))return motome2(b+1,A,N);
		else if(sum>motome(b-1,A,N))return motome2(b-1,A,N);
		else return sum;
	}
}
