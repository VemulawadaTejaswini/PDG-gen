
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=in.nextInt();
		int w=0;
		int p=1;
		int[] c=new int[n];
		for (int i = 0; i < n; i++) {
			c[i]=in.nextInt();
		}
		int t=1;
		boolean flg=false;
		while(flg==false) {
			flg=true;
			t=1;
			w=0;
			p+=1;
			for (int i = 0; i < n; i++) {
				if(w+c[i]>p) {
					t+=1;
					w=c[i];
				}else {
					w+=c[i];
				}
				if(t>count) {
					flg=false;
				}
			}
		}


		System.out.println(p);
		in.close();
	}

}

