
import java.util.Scanner;
public class Main {
	static int test1=1,test2=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int K=sc.nextInt();
		int G=A+B;
		int[] tower=new int[N];
		int i=0;
		int sum=0;
		sum=calc(N,A,B,G,K,tower,i);
		System.out.println(sum%998244353);

		}
	static int calc(int N,int A,int B,int G,int K,int tower[],int i) {
		int sum=0;
		//System.out.println(test1+"times:calc1");test1++;
		int tmp;
		while(i<N) {
			tmp=0;
			for(int j=1;j<4;j++) {
				if(j==1) {tower[i]=A;}
				if(j==2) {tower[i]=B;}
				if(j==3) {tower[i]=G;}
				if(i>0) {sum+=calc2(N,A,B,G,K,tower,i-1,sum);}

				if(i==0) {for(int k=0;k<N;k++) {tmp+=tower[k];}if(tmp==K) {sum++;}tmp=0;}
				}

			i++;
			}
		return sum;
		}
	static int  calc2(int N,int A,int B,int G,int K,int tower[],int i,int sum) {
		//System.out.println(test2+"times:calc2");test2++;
		int tmp;
			tmp=0;
			for(int j=0;j<4;j++) {
				if(j==0) {tower[i]=0;}
				if(j==1) {tower[i]=A;}
				if(j==2) {tower[i]=B;}
				if(j==3) {tower[i]=G;}
				if(i>0) {calc2(N,A,B,G,K,tower,i-1,sum);}
				if(i==0) {for(int k=0;k<N;k++) {tmp+=tower[k];}if(tmp==K) {sum++;}tmp=0;}

				}

		return sum;
		}
	}

