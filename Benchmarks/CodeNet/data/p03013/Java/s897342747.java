import java.util.Scanner;

public class Main{ //ABC129C
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		int[] A = new int[M+2];
		A[0] = 0;
		for(int i=1;i<M+1;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		A[M+1] = N;
		//System.out.println(A[0]+","+A[1]+","+A[2]+","+A[3]+",");


		int[] spc = new int[M+1];//

		boolean con = false;
		int spcMax = 0;
		for(int i=0;i<M+1;i++){

			//System.out.println(i+","+M);

			if((i!=1||i!=M)&&A[i]+1==A[i+1]&&A[i+1]!=1){
				//System.out.println(i+",if");
				con = true;
				break;
			}else {
				spc[i] = A[i+1] - A[i] - 1;
				/*System.out.println(spc[i]);
				System.out.println(A[i]);*/

				if(spcMax<spc[i]){
					spcMax = spc[i];
				}
			}
		}

		if(con) {
			System.out.println(0);
		}else {
			int[] num = new int[spcMax+1];

			num[0] = 1;
			num[1] = 1;
			for(int i=2;i<=spcMax;i++){
				num[i] = num[i-1]+num[i-2];
			}

			long ans = 1;
			for(int i=0;i<M+1;i++){
				if(spc[i]!=0 &&num[spc[i]]!=0) {
					ans*=num[spc[i]];
					/*System.out.println(spc[0]);
					System.out.println(spc[1]);
					System.out.println(spcMax);*/
				}
			}
			System.out.println(ans%1000000007+"ans");
		}
	}
}