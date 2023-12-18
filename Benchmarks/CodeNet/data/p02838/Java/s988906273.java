import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i =0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		
		int[][] bits = new int[n][60];
		for(int i=0;i<n;i++) {
			for(int j=59;j>=0;j--) {
				
				if(a[i]>=Math.pow(2, j)) {
					a[i]-=Math.pow(2,j);
					bits[i][j]=1;
				}else {
					bits[i][j]=0;
				}
			}
		}
		int[][] sums = new int[n][60];
		for(int i=0;i<60;i++) {
			sums[0][i]=0;
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<60;j++) {
				sums[i+1][j]= sums[i][j]+bits[i][j];
			}
		}
		long sum = 0;
		for(int i=0;i<60;i++) {
			long subsum =0;
			for(int j=1;j<n;j++) {
				if(bits[j][i]==0) {
					subsum+=sums[j][i];
				}else {
					subsum+=j-sums[j][i];
				}
			}
			subsum = subsum%1000000007;
			subsum = (long) (subsum*Math.pow(2,i)%1000000007);
			sum = (sum +subsum)%1000000007; 
		}
		
		System.out.println(sum);
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
