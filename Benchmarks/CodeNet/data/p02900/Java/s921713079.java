import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long d = a;
		long e = b;
		
		b = Math.min(e, d);
		a = Math.max(e, d);
		b = d;
		while(b != 0){
			b = a % b;
			a = d;
			d = b;
		}
		int c = (int)a;
		// 文字列の入力
		boolean[] g = new boolean[c];
		for(int i = 0; i < c; i++){
			g[i] = true;
			
		}
		for(int i = 2; i < c; i++){
			if(g[i]){
				for(int j = 2 * i; j < c; j += i){
					g[j] = false;
				}
			}
			
		}
      //System.out.println(c);
		int f = 1;
		for(int i = 2; i < c;i++){
			if(c % i == 0){
				if(g[i]){
					f++;
                  
				}
			}
		}
		
		System.out.println(f);
		
		
	}
}