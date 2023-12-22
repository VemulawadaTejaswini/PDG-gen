import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();


		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
			b.add(sc.nextInt());
		}

		Collections.sort(a);
		Collections.sort(b);

		if(n%2==0) {
			double min = ((double)(a.get(n/2-1)+a.get(n/2)))/2;
			double max = ((double)(b.get(n/2-1)+b.get(n/2)))/2;
			System.out.println((int)(max-min)/0.5+1);
		}else {
			double min = a.get(n/2);
			double max = b.get(n/2);
			System.out.println((int)(max-min)+1);
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
