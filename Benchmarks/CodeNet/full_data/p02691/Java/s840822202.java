import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n+1];
		
		for(int i=1;i<n+1;i++) {
			a[i] = sc.nextLong();
		}
		
		int[] upper = new int[200000];
		int[] lower = new int[200000];
		
		for(int i =0;i<200000;i++) {
			upper[i]= 0;
			lower[i]= 0;
		}
		for(int i = 1;i<=n;i++) {
			int plus = (int) (a[i]+i);
			int minus = (int) (i-a[i]);
			if(0<plus&&plus<200000)upper[plus]++;
			if(0<minus&&minus<200000)lower[minus]++;
		}
		long counter =0;
		for(int i=1;i<200000;i++) {
			counter = counter + upper[i]*lower[i];
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
