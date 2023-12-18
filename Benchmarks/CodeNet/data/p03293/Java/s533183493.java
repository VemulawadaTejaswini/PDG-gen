import java.util.Arrays;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		int[][] data = {{1,11},{5,3}};
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();

		char[] ss = S.toCharArray();
		char[] tt = T.toCharArray();

		Arrays.sort(ss);
		Arrays.sort(tt);

		boolean flag = true;

		for(int i = 0;i < S.length();i++){
			if(ss[i] != tt[i]){
				flag = false;
				break;
			}



		}
		if(flag){
			System.out.println("Yes");

		}else{
			System.out.println("No");
		}








		//		String S = scan.next();

		//		int[] data = new int[N];
		//		for(int i= 0; i < N ;i++){
		//			data[i] = scan.nextInt();
		//		}
		//
		//		int[][] mat = new int[N][N];
		//		int[][] xor = new int[N][N];
		//
		//		for(int i = 0;i < N;i++){
		//			mat[i][i] = data[i];
		//			for(int j = i; j < N-1;j++){
		//				mat[i][j+1] = mat[i][j]+ data[j+1];
		//
		//			}	
		//		}
		//		
		//		for(int i =0 ; i<N;i++){
		//			for(int j = 0;j < N;j++){
		//			System.out.print(mat[i][j]);
		//			System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//
		//		}
		//		
		//
		//		for(int i = 0;i < N;i++){
		//			xor[i][i] = data[i];
		//			for(int j = i; j < N-1;j++){
		//				xor[i][j+1] +=xor[i][j] ^ data[j];
		//
		//			}	
		//		}
		//		
		//		for(int i =0 ; i<N;i++){
		//			for(int j = 0;j < N;j++){
		//			System.out.print(mat[i][j]);
		//			System.out.print(" ");
		//
		//			}
		//			System.out.println();
		//
		//		}
		//
		//		int count = 0;
		//		for(int i= 0;i < N;i++){
		//			for(int j = i;j < N;j++){
		//				if(xor[i][j] == mat[i][j]&&mat[i][j] != 0 ){
		//					count++;
		//				}
		//			}
		//		}
		//		System.out.println(count);
		//
		//


	}
}






