import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		long[] a = new long[n+1];
		for(int i=1;i<=n;i++)a[i]=Long.parseLong(sc.next());
		sc.close();

		//nが1以下なら出力して終了
		if(n <= 1) {System.out.println(n);return;}
		long cnt = 1,onecnt=0,res = 0;
		for(int i = 1;i<=n;i++) {


			if(a[i]==1) {onecnt++;if(cnt > res) {res = cnt;cnt=1;continue;}}

			if(a[i-1]>=a[i]) {
				//3 2 || 2 2
				cnt++;
			}
		}
		if(onecnt > res) {res=onecnt;}
		if(cnt > res)res=cnt;


		System.out.println(res);


	}

}