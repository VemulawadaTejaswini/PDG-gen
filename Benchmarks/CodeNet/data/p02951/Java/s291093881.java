import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n=stdin.nextInt();
		int[] h=new int[n];
		String ans[]= {"YES","NO"};
		for(int i=0;i<n;++i)
		 h[i]=stdin.nextInt();
		stdin.close();
		for(int i=0;i<n-1;i++) {
			if(h[i]>h[i+1]) {
				h[i]=h[i]-1;
			}
		}
		int c=0;
		int i=0;
		for(i=n-1;i>0;--i) {
			int temp=h[i-1]-h[i];
			if(temp>0) {
				if(temp>1) {
					c=1;
					break;
				}
				h[i-1]--;
			}

		}
		System.out.println(ans[c]);

	}

}
