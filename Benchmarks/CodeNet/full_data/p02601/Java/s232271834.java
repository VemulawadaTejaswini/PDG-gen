import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int K = sc.nextInt();
		boolean jud = false;
		
		int a1 = a;
		int b1 = b;
		int c1 = c;
//ここまではたぶんあってる
		
		for (int i = 0; i <= K; i++) {
			for (int j = 0; j <= K; j++) {
				for (int k = 0; k <= K; k++) {
					int x = a * i;
					int y = b * j;
					int z = c * k;
					if (judge(x,y,z)) jud = true;
				}
			}
		}
//ここからもたぶんあってる
		if(jud == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	public static boolean judge(int a, int b, int c){
		if((a < b)&&(b < c)){
			return true;
		}else{
			return false;
		}
	}
	
}