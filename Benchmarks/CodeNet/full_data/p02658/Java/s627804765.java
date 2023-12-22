import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		boolean over = false;
		long big = (long)100000000*10000*1000000;
		long a = 1;
		for(int i=0;i<n;i++) {
			long ai = sc.nextLong();
			if(ai==0) {
				a=0;
				break;
			}
			if((Math.log10(a)+Math.log10(ai))>18.1) {
				over = true;
			}
			if(a*ai>big) {
				over = true;
			}
			a = a*ai;
		}
		if(a==0) {
			System.out.println(a);
		}else {
			if(over) {
				System.out.println(-1);
			}else {
				System.out.println(a);

			}
		}







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
