import java.util.Scanner;

//Scanner sc = new Scanner(System.in);

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[][] R = new int[N][N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				R[i][j] = A[j];
			}
		}
		
		int min = (int)Math.pow(10, 9);
		
	
		for(int i = 0; i < N; i++){
			int num = A[i];
			for(int j = 0; j < N; j++){
				boolean updated = true;
				while(updated){
					int big = num > R[i][j] ? num : R[i][j];
					int small = num > R[i][j] ? R[i][j] : num;
					int mod = big % small;
					if(mod == 0){
						updated = false;
						R[i][j] = small;
					}else{
						if(mod < small){
							updated = true;
							R[i][j] = mod;
						}else updated = false;						
						min = (min > mod) ? mod : min;
					}						
				}
			}	
		}
		System.out.println(min);
	}
}
