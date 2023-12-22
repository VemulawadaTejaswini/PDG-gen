import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();  	//入力数
		int A[]=new int [n];
		int B[]=new int [n];
		int count=0;
		
		for (int i=0;i<n;i++) { //n回繰り返し
			
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
			
		}
		int k=0;
		
		for (int i=0;i<n;i++) {
			
			
			while(k<n) {
				if(A[i]*A[k]+B[i]*B[k]!=0) {
					count++;
					
				}
				k++;
			}
			k++;
		}
		
		System.out.println(count+n);
	}

}
