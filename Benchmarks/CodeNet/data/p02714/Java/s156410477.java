import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");
		long rsize = 0;
		int gsize = 0;
		int bsize = 0;
		for(int i =0;i<ss.length;i++) {
			if(ss[i].equals("R"))rsize++;
			if(ss[i].equals("G"))gsize++;
			if(ss[i].equals("B"))bsize++;
		}
		int counter = 0;
		for(int i =1;i<n/2+1;i++) {
			for(int j =0;j+i*2<n;j++) {
				if(!ss[j].equals(ss[j+i])) {
					if(!ss[j].equals(ss[j+i*2])) {
						if(!ss[j+i].equals(ss[j+i*2]))counter++;
					}
				}
			}
		}
		System.out.println(rsize*gsize*bsize-counter);
	}

	static int gcd(int a,int b,int c) {
		int ans = 1;
		int max = Math.max(Math.max(a, b),c);
		for(int i =max;i>0;i--) {
			if(a%i==0) {
				if(b%i==0) {
					if(c%i==0) {
						ans = i;
						break;
					}
				}
			}
		}
		return ans;
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
