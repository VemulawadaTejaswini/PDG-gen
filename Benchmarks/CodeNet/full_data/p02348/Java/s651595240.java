import java.util.Scanner;
/**
 * @author Chen Qiu, email:m5222104@u-aizu.ac.jp
 *@version : 2019/April
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] D;
		int q;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		q=in.nextInt();
        n = (int)Math.ceil(Math.log(n) / Math.log(2));
        n=1<<n;
		D=new int[n];
		int INF=Integer.MAX_VALUE;
		for (int i= 0; i < 2*n-1; i++ ){
			D[i]=INF;
		}
		int a,b,c,d;
		for (int i = 0; i < q; i++) {
			a=in.nextInt();
			b=in.nextInt();
			if (a==0) {
				c=in.nextInt();
				d=in.nextInt();
				for (int j=b+n-1;j < c+n ;j++) {
					D[j]=d;
				}
			}else {
				System.out.println(D[b+n-1]);
			}
		}
	}
}

