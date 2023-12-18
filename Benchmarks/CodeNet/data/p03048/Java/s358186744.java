import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int G=sc.nextInt();
		int B=sc.nextInt();
		int N=sc.nextInt();
		int count=0;
		for(int i=0;i<=N/R;i++) {
			for(int j=0;j<=(N-i)/G;j++) {
				for(int k=0;k<=(N-i-j)/B;k++) {
					if(R*i+G*j+k*B==N) {
						count++;
				}
				}
			}
		}
		System.out.println(count);
	}
	
		
}