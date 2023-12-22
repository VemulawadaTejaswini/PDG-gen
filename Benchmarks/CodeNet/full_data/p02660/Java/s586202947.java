import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		int[] soin = new int[1000001];
		for(int i =0;i<soin.length;i++) {
			soin[i]=0;
		}
		int target = 2;
		boolean sosu  =true;
		long nn = n;
		while(target<(int)Math.sqrt(nn)+1) {
			if(n%target==0) {
				n = n/target;
				soin[target]++;
				sosu =false;
			}else {
				target++;
			}
		}
		int counter =0;
		for(int i=0;i<soin.length;i++) {
			int checker =1;
			while(checker<=soin[i]) {
				counter++;
				soin[i]-=checker;
				checker++;
			}
		}
		if(sosu&&(nn!=1)) {
			System.out.println(1);
		}else {
			System.out.println(counter);
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
