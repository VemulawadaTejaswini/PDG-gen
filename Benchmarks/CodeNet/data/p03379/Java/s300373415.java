import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] X=new int[N];
		int[] Y=new int[N];
		for(int i=0;i<N;i++){
			int k=sc.nextInt();
			X[i]=k;
			Y[i]=k;
		}
		Arrays.sort(Y);
		int m=Y[N/2-1],k=Y[N/2];
		for(int i=0;i<N;i++){
			if(X[i]<=m){
				System.out.println(k);
			}else{
				System.out.println(m);
			}
		}
	}
}
