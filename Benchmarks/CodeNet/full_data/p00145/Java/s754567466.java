import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		//while(sc.hasNext()){
			int n = sc.nextInt();
			
			int [][] data = new int[n][2];
			int [][] memo = new int[n][n];
			for(int i=0; i < n; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
				memo[i][i] = data[i][0] * data[i][1];
			}
			if(n == 1){
				System.out.println(0);
				//continue;
				return ;
			}
			
			for(int i = 0; i < n-1; i++){
				memo[i][i+1] = memo[i][i] * memo[i+1][i+1];
			}
			
			for(int k = 2; k < n; k++){
				for(int i =0; i + k < n; i++){
					int vv1 = (data[i][0] * data[i+k-1][1]) * (data[i+k][0] * data[i+k][1]);
					int vv2 = (data[i][0] * data[i][1]) * (data[i+1][0] * data[i+k][1]);
					int v1 = memo[i][i+k-1] +  vv1;
					int v2 = vv2 + memo[i+1][i+k];
					memo[i][i+k] = Math.min(v1, v2);
				}
			}
			
//			//debug
//			for(int i=0; i < n; i++){
//				for(int j = 0;  i+ j < n;j++){
//					System.out.print(memo[j][i+j] + " ");
//				}
//				System.out.println();
//			}
			System.out.println(memo[0][n-1]);
		//}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}