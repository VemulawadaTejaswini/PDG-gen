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


		boolean renewed = true;
		while(renewed) {
			renewed = false;
			for(int i =0;i<m;i++) {
				if(times[a[i]]==100000&&times[b[i]]==100000)continue;
				if(times[b[i]]>1+times[a[i]]) {
					times[b[i]]=1+times[a[i]];
					path[b[i]]=a[i];
					renewed = true;
				}
				if(times[a[i]]>1+times[b[i]]) {
					times[a[i]]=1+times[b[i]];
					path[a[i]]=b[i];
					renewed = true;
				}
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
