import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n,x;
		int y[][] = new int[50][2];
		int i = 0;
		while(true){
			n = stdIn.nextInt();
			x = stdIn.nextInt();
			if ((n==0)&&(x==0)) {
				break;
			} else {
				y[i][0] = n;
				y[i][1] = x;
				i++;
			}
		}
		stdIn.close();
		for(int j=0;j<i; j++) {
			if((y[j][0]*3-3 < y[j][1])|| y[j][1]<6) {
				System.out.println("0");
			} else if((y[j][0] !=0) && (y[j][1]!=0)) {
				System.out.println(check(y[j][0],y[j][1]));
			}
		}
	}
	static int check(int m,int n){
		int ans=0;
		for(int a=m;a>=1;a--) {
			for(int b=m;b>=1;b--){
				if((1<=n-a-b) && (n-a-b <= m)){
					if((a!=b) && (a!=n-a-b) && (b!=n-a-b)) {
						ans +=1;
					}
				}

			}
		}

		return ans/6;
	}
}

