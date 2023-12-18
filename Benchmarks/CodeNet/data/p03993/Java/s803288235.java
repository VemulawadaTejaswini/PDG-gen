import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		int count =0;
		int[][] sys_m = new int[n][n];
		// create second array 
		for (int i=0;i<n;i++){
			 ar[i]= sc.nextInt();
		}
		//create symmetric matrix
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
					sys_m[i][j] = 0;
			}
		}
		//set relation on symmetirc matrix
		for (int i=0;i<n;i++){
			int tmp = ar[i]-1;
			sys_m[i][tmp] = 1;
		}
//		for (int i=0;i<n;i++){
//			for (int j=0;j<n;j++){
//				System.out.print(sys_m[i][j] + " ");
//			}
//			System.out.println();
//		}
		// count relation pair
		for (int i=0;i<n;i++){
			int tmp = ar[i]-1;
			if (sys_m[i][tmp]==1&& sys_m[tmp][i]==1){
				count++;
			}
		}
		System.out.print(count/2);
	}

}