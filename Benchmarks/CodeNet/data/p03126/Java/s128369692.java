import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] k = new int[n][m];
		//input
		for(int i = 0; i < k.length; i++){
			int tmp = sc.nextInt();
			for(int j = 0; j < tmp; j++){
				k[i][sc.nextInt()-1] = 1;
			}
		}
		int outp=0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(k[j][i] == 0){
					break;
				}else if(j == k.length-1){
					outp++;
				}
			}
		}
		System.out.println(outp);
	}
}