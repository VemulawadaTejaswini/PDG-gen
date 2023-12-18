import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] h = new int[n];
		
		boolean[] good = new boolean[n];
		for(int i = 0;i<n;i++) {
			h[i] = sc.nextInt();
			good[i]= true;
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			if(h[a]<=h[b]) {
				good[a]=false;
			}
			
			if(h[b]<=h[a]) {
				good[b]=false;
			}
		}
		

		
		int counter =0;
		for(int i =0;i<n;i++) {
			if(good[i])counter++;
		}

		System.out.println(counter);

	}

	static long divn(int target, int times) {//10_9+7のあまり累乗版
		int sqtimes = (int)Math.sqrt(times);
		long ans = 1;
		for(int i =0;i<sqtimes;i++) {
			ans = (ans * target)%(1000000000+7);
		}
		long holder = ans;
		ans = 1;
		for(int i =0;i<sqtimes;i++) {
			ans = (ans*holder)%(1000000000+7);
		}
		for(int i=0;i<times - sqtimes*sqtimes;i++) {
			ans = (ans * target)%(1000000000+7);
		}
		return ans;
	}

	static long div(long a) {//10_9+7のあまり
		if(a<0)a+=1000000000+7;
		return a%(1000000000+7);
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
