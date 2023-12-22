import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b =new int[m];

		for(int i =0;i<m;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}

		int[] times = new int[n+1];
		int[] path = new int[n+1];

		for(int i =0;i<n+1;i++) {
			times[i]=100000;
			path[i]=0;
		}
		times[1]=0;
		path[1]=1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<m;i++) {
			list.add(i);
		}

		boolean renewed = true;
		while(renewed) {
			renewed = false;
			for(int i =list.size()-1;i>=0;i--) {
				if(times[a[list.get(i)]]==100000&&times[b[list.get(i)]]==100000) {
					continue;
				}
				if(times[b[list.get(i)]]>1+times[a[list.get(i)]]) {
					times[b[list.get(i)]]=1+times[a[list.get(i)]];
					path[b[list.get(i)]]=a[list.get(i)];
					renewed = true;
				}
				if(times[a[list.get(i)]]>1+times[b[list.get(i)]]) {
					times[a[list.get(i)]]=1+times[b[list.get(i)]];
					path[a[list.get(i)]]=b[list.get(i)];
					renewed = true;
				}
				list.remove(i);
			}
		}
		System.out.println("Yes");
		for(int i=2;i<n+1;i++) {

			System.out.println(path[i]);
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
