import java.util.Arrays;
import java.util.Scanner;


public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			int[] s = new int[n], t = new int[n];
			for(int i=0;i<n;i++){
				String[] r = sc.next().split(":"), v = sc.next().split(":");
				s[i] = Integer.parseInt(r[0])*3600+Integer.parseInt(r[1])*60+Integer.parseInt(r[2]);
				t[i] = Integer.parseInt(v[0])*3600+Integer.parseInt(v[1])*60+Integer.parseInt(v[2]);
			}
			Arrays.sort(s); Arrays.sort(t);
			int res = n;
			for(int i=0;i<n;i++)for(int j=0;j<i;j++){
				if(t[j]<=s[i]){
					res--; t[j] = 1<<29; break;
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}