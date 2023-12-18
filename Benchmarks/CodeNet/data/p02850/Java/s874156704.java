import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// 文字列の入力
		int[] d = new int[a - 1];
		int[] e = new int[a - 1];
		int[] c = new int[a];
		for(int i = 0; i < a - 1; i++){
			d[i] = sc.nextInt();
			e[i] = sc.nextInt();
		} 
		for(int i = 0; i < a - 1; i++){
			c[d[i] - 1] ++;
			c[e[i] - 1] ++;
			
		}
		int intMax = c[0]; //配列の最大値が0の場合もあるため、配列の要素の1番目で初期化すること

		for(int i = 1; i < a; i++) {
          if(intMax < c[i]) {
        		intMax = c[i];
    		}
		}
		
		System.out.println(intMax);
      boolean flag = true;
		boolean[][] b = new boolean[a + 1][intMax];
		int[] f = new int[a];
		for(int i = 0; i < a - 1; i++){
          flag = true;
        	for(int j = 0; j < intMax && flag;j++){
              // System.out.println(j);
            	if(!b[d[i]][j] && !b[e[i]][j]){
                	// System.out.println(i + 1);
                  System.out.println(j + 1);
                  // System.out.println(d[i] + "and" + e[i]);
                  flag = false;
                  	b[d[i]][j] = true;
                      b[e[i]][j] = true;
                }
            }
        }
     
		
		
	}
}