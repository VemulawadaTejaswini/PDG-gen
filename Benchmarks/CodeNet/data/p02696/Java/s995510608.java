import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		// 出力
      	int ans =0;
      	int nans =0;
      	int x = 1;
	    int p = 0;
      	int q = 0;
      	while(x <=n){
			p = (int)(a*x/b);
          	q = (int)(x/b);
			ans = p - a * q;
			if(ans < nans){
				System.out.println(nans);
	            return;
            }
          	nans = ans;
			x++;
		}
		System.out.println(nans);
	}
}