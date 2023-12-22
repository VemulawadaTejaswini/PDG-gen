import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		String[] d = new String[a];
		for(int i = 0; i < a; i++){
				d[i] = sc.next();
	
			
		}
		boolean [][] e = new boolean[a][b];
		for(int i = 0; i < a; i++){
			for(int j = 0; j < b;j++){
				
				if((String.valueOf(d[i].charAt(j))).equals("#")){
					e[i][j] = true;
				}
			}
			
		}
		int i[] = new int[(int)Math.pow(2, a)];
		int j[] = new int[(int)Math.pow(2, b)];
		int m = 0;
		int n = 0;
		for(int k1 = 0;k1 < Math.pow(2, a);k1++){
			for(int j1 = 0;j1 < Math.pow(2, b);j1++){
				for(int k = 0; k < a; k++){
					for(int l = 0; l < b;l++){
						
						if(e[k][l] && (i[k1] % Math.pow(2,k + 1)) < (Math.pow(2,k) + 1) && (j[j1] % Math.pow(2,k + 1)) < (Math.pow(2,k) + 1)){
							m++;
						}
					}
					
				}
				if(m == c){
																				
					n++;
				}
				m = 0;

			}
		}
		System.out.println(n);
		
		
	}
}