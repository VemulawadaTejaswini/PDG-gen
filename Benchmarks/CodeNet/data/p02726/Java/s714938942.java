import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static int[] rudder = new int[200001];

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[] a = new int[n];
		for(int i =0;i<n;i++) {
			a[i]=0;
		}

		for(int i=1;i<n;i++) {
			for(int j=i+1;j<n+1;j++) {
				if(x>=i) {
					if(x>=j) {
						a[j-i]++;
					}
					if(j>x&&y>j) {
						a[Math.min(j-i, y-j+x-i+1)]++;
					}
					if(j>=y) {
						a[x-i+1+j-y]++;
					}
				}
				if(x<i&&y>i) {
					if(j<y) {
						a[Math.min(j-i, i-x+1+y-j)]++;
					}
					if(j>=y) {
						a[Math.min(j-i, i-x+1+j-y)]++;
					}
				}
				if(x>=y)a[j-i]++;
			}
		}

		for(int i =1;i<n;i++) {
			System.out.println(a[i]);
		}


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
