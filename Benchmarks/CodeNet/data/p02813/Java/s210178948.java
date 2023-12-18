import java.util.Scanner;

public class Main {
	static int count_p,count_q,p,q,n;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		p = 0;
		q = 0;
		int mul = pow(10 , n - 1);
		for(int i = 0 ; i < n ; i++) {
			p += sc.nextInt() * mul;
			mul /= 10;
		}
		mul = pow(10 , n - 1);
		for(int i = 0 ; i < n ; i++) {
			q += sc.nextInt() * mul;
			mul /= 10;
		}
		count_p = 0;
		count_q = 0;
		count("");

		System.out.println(Math.abs(count_p - count_q));

	}
	public static void count(String s) {
		if(s.length() == n) {
			int i = Integer.valueOf(s);
			if(p >= i)
				count_p++;
			if(q >= i)
				count_q++;
			return;
		}
		for(int i = 1 ; i <= n ; i++) {
			String s2 = s;
			if(!s2.contains(i + "")) {
				count(s2 += i);
			}
		}

	}
	public static int pow(int a,int b) {
        int ret = 1;
        int tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp);  //2進数によるべき乗の高速計算
            tmp *= tmp;
            b = b>>1;
        }
        return ret;
    }
}

