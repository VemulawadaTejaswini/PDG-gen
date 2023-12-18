import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[][] x = new int[n][n];//index+1
		int[][] y = new int[n][n];//1or 0

		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
			for(int j = 0;j<a[i];j++) {
				x[i][j]= sc.nextInt();
				y[i][j]=sc.nextInt();

			}
		}
		int max = 0;
		for(int i =1;i<Math.pow(2, n);i++) {
			boolean suc = true;
			int[] bits = new int[n];

			int c = i;
			for(int j=0;j<bits.length;j++) {
				bits[j]=0;
				if(c>=Math.pow(2, n-j-1)) {
					c-=Math.pow(2,n-j-1);
					bits[j]=1;
				}
			}
			for(int j=0;j<bits.length;j++) {
				if(bits[j]==1) {
					for(int k=0;k<a[j];k++) {
						if(bits[x[j][k]-1]!=y[j][k]) {
							suc = false;
							break;
						}
					}
				}
			}
			if(suc) {
				int counter =0;
				for(int j=0;j<bits.length;j++) {
					counter+=bits[j];
				}
				if(max<counter)max = counter;
			}
		}
		System.out.println(max);
	}
	public static long calc(int n,int c) {
		long ans = 1;
		for(int i =1;i<n+1;i++) {
			ans = (ans * i)%1000000007;
		}
		ans = ans * reverse(c)%1000000007;

		return ans*reverse(n-c)%1000000007;
	}
	public static long reverse(int c) {
		long divider =1;
		for(int i =1;i<c+1;i++) {
			divider = (divider * i)%1000000007;
		}
		long dividerholder=divider;
		for(int i=1;i<10000;i++) {
			divider = divider*dividerholder%1000000007;
		}
		long dividerholder2 = divider;
		for(int i=1;i<100000;i++) {
			divider = divider*dividerholder2%1000000007;
		}
		for(int i=0;i<5;i++) {
			divider = divider*dividerholder%1000000007;
		}
		return divider;
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
