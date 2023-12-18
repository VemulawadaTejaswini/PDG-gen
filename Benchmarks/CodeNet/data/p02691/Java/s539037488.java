import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner (System.in) ;
		int N=scan.nextInt();
		int A[]=new int[N];
		int num=0;
		for(int i=0;i<N;i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
			if(j-i==(A[i]+A[j])) {	
				num++;
			}
			else {}
			}
		}
		System.out.println(num);
	}
}
