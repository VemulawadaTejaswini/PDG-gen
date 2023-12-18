import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		long[] fives = new long[200];
		
		for(int i=0;i<200;i++) {
			fives[i]=(long)i*i*i*i*i; 
		}
		
		boolean found = false;
		int a = 0;
		int b = 0;
		
		for(int i =0;i<200;i++) {//sum
			for(int j = 0;j<200;j++) {
				if(fives[i]+fives[j]==x) {
					a = i;
					b = -j;
					found = true;
					break;
				}
			}
		}
		if(!found) {
			for(int i =0;i<200;i++) {//sum
				for(int j = i;j<200;j++) {
					if(-fives[i]+fives[j]==x) {
						a = j;
						b = i;
						found = true;
						break;
					}
				}
			}
		}
		System.out.println(a+" "+b);
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
