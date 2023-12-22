import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int ans = 0;
		if(N <= 1999 && N >= 1800){
			ans = 1;
		}else if(N <= 1799 && N >= 1600){
			ans = 2;
		}else if(N <= 1599 && N >= 1400){
			ans = 3;
		}else if(N <= 1399 && N >= 1200){
			ans = 4;
		}else if(N <= 1199 && N >= 1000){
			ans = 5;
		}else if(N <= 999 && N>= 800){
			ans = 6;
		}else if(N <= 799 && N >= 600){
			ans = 7;
		}else if(N <= 599 && N >= 400){
			ans = 8;
		}
		System.out.println(ans);
	}
}
