import java.util.Scanner;

public class Main  {
	

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soe =0;
	int N = sc.nextInt();
	long[] A = new long [N];	
	long kai = 1;
		
		while(soe != N) {
			A[soe] = sc.nextLong();
			kai = kai * A[soe];
			soe++;
			
		}
			
			System.out.println(kai);
			
	}
}
