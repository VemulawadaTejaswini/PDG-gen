import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		
		
        // 文字列の入力
        int [] b = new int[a];
		int[][] d = new int[a][a];
		int[][] e = new int[a][a];
		for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
          //System.out.println(b[i] + "and");
            for(int j = 0; j < b[i]; j++){
                d[i][j] = sc.nextInt();
                d[i][j] --;
              //System.out.print(d[i][j]);
                e[i][j] = sc.nextInt();
              //System.out.println(e[i][j]);
            }
        }
        int [] c = new int[a];
        int f = 0;
        int g = 0;
        boolean h = false;
		for(int i = 0; i < (int)Math.pow(2, a ); i++){
              int l = 1;
			for(int j = 0; j < a; j++){
                c[j] = (i / l) % 2;
              l = l * 2;
            }
            h = true;
            for(int j = 0; j < a && h; j++){
                for(int k = 0; k < b[j] && h; k++){
                    if((c[j] + e[j][k] + 1 ) % 2 != c[d[j][k]] ){
                        h = false;
                      //System.out.println(i  + "と" + j + "と" + k);
                    }
                }
            }
            if(h){
              
                for(int j = 0; j < a; j++){
                    f += c[j];
                }
                if(f > g){
                    g = f;
                  System.out.println(i);
                }
                f = 0;
            }
            
		}
      
		System.out.println(g);
		
		
	}
}