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
				k[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		for(int i = 0; i < k.length; i++){
			for(int j = 0; j < k[i].length; j++){
				for(int l = j; l < k[i].length-1; l++){
					if( k[i][j] < k[i][l]){
						int tmp = k[i][j];
						k[i][j] = k[i][l];
						k[i][l] = tmp;
					}
				}
				if(k[i][j] > max){
					max = k[i][j];
				}
			}
		}
		int outp = 0;
		int flag=0;
		u:for(int l = max; l > 0; l--){
			for(int i = 0; i < k.length; i++){
				for(int j = 0; j < k[i].length; j++){
					if(k[i][j] == l){
						flag++;
						break;
					}else if(k[i][j] < l || j == k[i].length -1){
						continue u;
					}
				}
			}
			if(flag == k.length){
				outp++;
			}
			flag = 0;
		}
		System.out.println(outp);
	}
}