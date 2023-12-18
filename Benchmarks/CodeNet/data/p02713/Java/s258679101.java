import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = 0;

		k = sc.nextInt();
		long ans = 0;
        for (int i = 1; i < k+1; i++) {
            for (int j = 1; j < k+1; j++) {
            	for (int m = 1; m < k+1; m++) {
            		if(i == 1 || j == 1 || m == 1){
            			ans += 1;
            		}else if(i == j && j == m){
            			ans += i;
            		}else{
                		ans += gcd(i,j,m);
            		}

            	}
            }
        }
			System.out.println(ans);
	}

	public static final int gcd(final int... param) {
	    final int len = param.length;
	    int g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
	    }
	    return g;
	}


	public static final int gcd(int a, int b) {
	    //a > b にする（スワップ）
	    if (a < b) {
	        int tmp = a;
	        a = b;
	        b = tmp;
	    }

	    //ユークリッドの互除法
	    int r = -1;
	    while (r != 0) {
	        r = a % b;
	        a = b;
	        b = r;
	    }

	    return a;    //b には r=0 の値が入るため、a を返す
	}
}