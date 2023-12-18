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

		boolean flag = true;
		for(int i=1;i<=n;i++) {
			if(a[i-1] >= a[i]) {
				flag = false;
				break;
			}
		}
		if(flag) {System.out.println(1);return;}

		long cnt = 1,onecnt=1,res = 2;
		flag = true;
		for(int i = 1;i<=n;i++) {
			if(a[i-1]<a[i]) {continue;}

			if(a[i]==1) {
				if(i>1) {onecnt++;}
				if(cnt > res && i > 1) {
					if((long)(Math.pow(res,a[i-1]))<cnt) {
						res=(long) (cnt / (Math.pow(res,a[i-1]))+2);
						}
					}
				cnt=1;flag=true;
			}else
			if(a[i-1]>a[i] && flag && a[i]!=1) {
				cnt++;
				flag = false;
			}else
			if(a[i-1]==a[i]) {
				cnt++;
				flag = false;
			}
			if((long)(Math.pow(res,a[i-1]))<=cnt) {res=(long) (cnt / (Math.pow(res,a[i-1]))+2);}
		}
		if(onecnt > res) {res=onecnt;}
		System.out.println(res);
	}

}