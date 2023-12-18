import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		int high[]=new int[2];
		int highnum;
		high[0]=A[0];
		highnum=0;
		for(int j=1;j<N;j++) {
			if(high[0]<A[j]) {
				high[0]=A[j];
				highnum=j;
			}
		}
		if(high[0]!=A[0]) {
			high[1]=A[0];
		}else {
			high[1]=A[1];
		}
		for(int k=0;k<N;k++) {
			if(high[1]<A[k]&&highnum!=k) {
				high[1]=A[k];
			}
		}
		for(int l=0;l<N;l++) {
			if(l!=highnum) {
			System.out.println(high[0]);
			}else {
			System.out.println(high[1]);
			}
		}
	}
}