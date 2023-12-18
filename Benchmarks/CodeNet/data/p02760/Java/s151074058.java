import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean isBingo(boolean B[][]){
		for(int i = 0 ; i < 3 ; ++i){
			boolean check = true;
			for(int j = 0 ; j < 3 ; ++j){
				if(!B[i][j]){
					check = false;
				}
			}
			if(check)return true;
			check = true;
			for(int j = 0 ; j < 3 ; ++j){
				if(!B[j][i]){
					check = false;
				}
			}
			if(check)return true;
		}
		boolean check = true;
		for(int i = 0 ; i < 3 ; ++i){
			if(!B[i][i]){
				check = false;
			}
		}
		if(check)return true;
		check = true;
		for(int i = 0 ; i < 3 ; ++i){
			if(!B[i][2 - i]){
				check = false;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[3][3];
		for(int i = 0 ; i < 3 ; ++i){
			for(int j = 0 ; j < 3 ; ++j){
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		boolean B[][] = new boolean[3][3];
		for(int a = 0 ; a < N ; ++a){
			int b = sc.nextInt();
			for(int i = 0 ; i < 3 ; ++i){
				for(int j = 0 ; j < 3 ; ++j){
					if(A[i][j] == b){
						B[i][j] = true;
					}
				}
			}
		}
//		System.out.println(Arrays.deepToString(B));
		if(isBingo(B)){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
