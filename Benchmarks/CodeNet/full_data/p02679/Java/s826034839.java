import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int [n];
		int B[]=new int [n];
		int count=0;
		for (int i=0;i<n;i++) {
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
			
		}
		for (int i=0;i<n;i++) {
			int k=0;
			while(k<n) {
				if(A[i]*A[k]+B[i]*B[k]!=0) {
					count++;
				}
			}
			k++;
		}
		
		System.out.println(count+n);
	}

}
