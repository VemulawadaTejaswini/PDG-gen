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
		long cnt = 1,onecnt=1,res = 0;
		boolean flag = true;
		for(int i = 1;i<=n;i++) {

			if(a[i]==1) {
				if(i>1) {onecnt++;}
				if(cnt > res) {res=cnt;}
				cnt=1;flag=true;
				continue;
				}

			if(a[i-1]>a[i] && flag) {
				//3 2 || 2 2
				cnt++;
				flag = false;
			}
			if(a[i-1]==a[i]) {
				cnt++;
				flag = false;
			}
		}
		if(onecnt > res) {res=onecnt;}
		if(cnt > res)res=cnt;

		System.out.println(res);
	}

}