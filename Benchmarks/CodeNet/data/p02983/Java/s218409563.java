import java.util.Scanner;
 
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		long x = (long)(2 * Math.pow(10,9)) * 2;
		a:for(int i = l; i < r; i++){
			for(int j = i+1; j <= r; j++){
				if(i*j % 2019 < x){
					x = i*j % 2019;
				}
				if(x == 0){
					break a;
				}
			}
		}
		System.out.println(x);
	}
}