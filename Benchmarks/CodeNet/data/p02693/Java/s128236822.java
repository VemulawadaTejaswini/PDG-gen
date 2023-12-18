import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = false;

		for(int i=a;i<b+1;i++) {
			if(i%k==0) {
				flag=true;
				break;
			}
		}

		if(flag) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
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
