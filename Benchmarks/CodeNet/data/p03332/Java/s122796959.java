
import java.util.Scanner;
public class Main {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),G=A+B;
		long K=sc.nextLong();
		int sum=0;
		int[] tower=new int[N];
		int j=N-1;
		long array[]= {0};
		sum=calc(N,A,B,G,K,sum,tower,j,array);
		System.out.println(array[0]%998244353);
	}



	public static int calc(int N,int A,int B,int G,long K,int sum,int tower[],int j,long array[]) {
		int tmp=0;
		int tmpsum=0;
		for(int i=0;i<4;i++) {
			if(i==0) {tower[j]=0;}
			if(i==1) {tower[j]=A;}
			if(i==2) {tower[j]=B;}
			if(i==3) {tower[j]=G;}
			if(j!=0) {sum+=calc(N,A,B,G,K,sum,tower,j-1,array);}
			if(j==0) {
				for(int test=N-1;test>=0;test--) {
			//System.out.print(tower[test]);
			}}
			for(int k=0;k<N;k++) {
				tmp+=tower[k];
			}
			//System.out.println("");
			if(tmp==K&&j==0) {
			tmpsum++;
			array[0]++;
			/*for(int test=N-1;test>=0;test--) {
				System.out.print(tower[test]);
				}
			System.out.println("sumcheck");*/
			}
			tmp=0;
		}

		if(j==N-1) {
			//System.out.println("last");
			return sum;}
		else{
			return tmpsum;}
	}

}
