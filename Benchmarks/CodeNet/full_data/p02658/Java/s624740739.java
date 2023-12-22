import java.util.Scanner;

public class Main  {
	

	public static  void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int soe =0;
	int N = sc.nextInt();
	long[] A = new long [N];	
	long kai =1;
	long ban =1000000000000000000L;
	boolean flg = false;
		
		while(soe != N) {
			A[soe] = sc.nextLong();
		if(A[soe] == 0) {
			System.out.println(0);
			flg = true;
			break;
		}
			soe++;
		}
		soe = 0;
		while(soe != N && flg == false) {
			kai = kai * A[soe];
			if(kai > ban) {
				System.out.println(-1);
				flg = true;
				break;
			}
			soe++;
		}
		 if(flg == false){
			
			System.out.println(kai);
		 }
	}
}
