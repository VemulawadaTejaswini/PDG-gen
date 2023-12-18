import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean judge(int[][] mat , int A , int B){
		int H = mat.length;
		int W = mat[0].length;
		for(int i = 0 ; i < mat.length ; ++i){
			int S1 = 0;
			for(int j = 0 ; j < mat[0].length ; ++j){
				S1 += mat[i][j];
			}
			if(S1 == A || S1 == W - A){				
			}else{
				return false;
			}
		}
		for(int i = 0; i < mat[0].length ; ++i){
			int S2 = 0;
			for(int j = 0 ; j < mat.length ; ++j){
				S2 += mat[j][i];
			}
			if(S2 == B || S2 == H - B){
				
			}else{
				return false;
			}
		}
		return true;
	}
	static boolean next(int[][] mat){
		for(int h = 0 ; h < mat.length ; ++h){
			for(int w = 0 ; w < mat[0].length ; ++w){
				if(mat[h][w] == 0){
					mat[h][w] = 1;
					return true;
				}else{
					mat[h][w] = 0;
				}
			}
		}
		return false;
	}
	static void print(int[][] mat){
		for(int i = 0 ; i < mat.length ; ++i){
			StringBuilder sb = new StringBuilder();

			for(int j = 0 ; j < mat[i].length ; ++j){
				sb.append(mat[i][j]);
			}
			System.out.println(sb);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt(); 
		int B = sc.nextInt();
		int mat[][] = new int[H][W];
		for(int b = 0 ; b < B ; ++b){
			for(int a = 0 ; a < A ; ++a){
				mat[b][a] = 0;
			}
			for(int a = A ; a < W ; ++a){
				mat[b][a] = 1;
			}
		}
		for(int b = B ; b < H ; ++b){
			for(int a = 0 ; a < A ; ++a){
				mat[b][a] = 1;
			}
			for(int a = A ; a < W ; ++a){
				mat[b][a] = 0;
			}			
		}
		if(judge(mat, A, B)){
			print(mat);
		}else{
			System.out.println("No");
		}
		/*
		do{
			if(judge(mat, A, B)){
				System.out.println(Arrays.deepToString(mat));
				break;
			}
//			System.out.println(Arrays.deepToString(mat));
		}while(next(mat));
		*/
		sc.close();
	}
}
