import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// スペース区切りの整数の入力
		long c[] = new long[a];
		boolean g[] = new boolean[a + 1];
		int f = 0;
		long MOD =  998244353;
		// 文字列の入力
		int[] d = new int[b];
		int[] e = new int[b];
		for(int i = 0; i < b; i++){
			d[i] = sc.nextInt();
			e[i] = sc.nextInt();
			f += e[i] - d[i] + 1;
          //System.out.println(e[i] - d[i] + 1);
		} 
      //System.out.println(f);
		for(int i = 0; i < b; i++){
			for(int j = d[i]; j < e[i] + 1;j++){
				g[j] = true;
			}
		}
		int[] h = new int[f];
		int z = 0;
		for(int i = 0; i < a; i++){
			if(g[i] == true){
              //System.out.println(z);
				h[z] = i;
				z++;
			}
		}
      for(int i = 0; i < f; i++){
			//System.out.println(h[i]);
		}
		for(int i = 0; i < a; i++){
			c[i] = 0;
		}
      c[0] = 1;
		for(int i = 0;i < a;i++){
			for(int j = 0;j < f;j++){
				if(i - h[j] > -1){
					c[i] += c[i - h[j]];
                  c[i] = c[i] % MOD;
				}
			}
		}
		System.out.println(c[a - 1]);
		
		
	}
}