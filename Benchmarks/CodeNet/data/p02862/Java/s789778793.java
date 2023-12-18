import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();

		boolean ans = false;
		long a = 1;
		if(y>x) {
			int yy = y;
			y = x;
			x = yy;
		}
		if((double)x/y>2.0) {

		}else {

			if((y-(x-y))%3!=0) {

			}else {
				ans = true;
				int s = (2*y-x)/3;
				int t = x-y;
				int[] divided = new int[s];
				int[] divide  = new int[s];
				for(int i=0;i<s;i++) {
					divided[i]=s+t+1+i;
					divide[i]=i+1;
				}

				for(int i =0;i<s;i++) {
					a = (a*divided[i])%1000000007;
				}
				long b = 1;
				for(int i =0;i<s;i++) {
					b = (b*divide[i])%1000000007;
				}
				long c =1;
				for(int i =0;i<100000;i++) {
					c = (c*b)%1000000007;
				}
				for(int i =0;i<10000;i++) {
					a = (a*c)%1000000007;
				}

				for(int i =0;i<5;i++) {
					a = (a*b)%1000000007;
				}
			}
		}
		if(ans) {
			System.out.println(a);
		}else {
			System.out.println(0);
		}
	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
