import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int m =scan.nextInt();
		int l =scan.nextInt();
		int A[][] = new int[100][100];	//[???][?¨?]
		int B[][] = new int[100][100];
		long keisan = 0;

		for(int i =0; i<n; i++){	//??????A?????????
			for(int ii=0;ii<m;ii++){
				A[i][ii] = scan.nextInt();
			}
		}

		for(int i=0;i<m;i++){	//??????B?????????
			for(int ii=0;ii<l;ii++){
				B[i][ii] = scan.nextInt();
			}
		}

		for (int i=0; i<n; i++){	//?¨????????????????C???
			for(int ii=0; ii<l; ii++){
				keisan = 0;
				for(int iii=0; iii<m; iii++){
					keisan += A[i][iii] * B[iii][ii];
				}
				System.out.print(keisan);
				if(ii < l-1){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}