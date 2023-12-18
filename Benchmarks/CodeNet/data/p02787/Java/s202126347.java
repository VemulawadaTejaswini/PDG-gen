import java.util.*;
public class Main {
	//最大公約数gcd
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	
	
//最小公倍数lcm
	static int lcm (int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (int)(c/b);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt(); //体力
		int n = stdIn.nextInt(); //魔法の種類
		
		int[] a = new int[n]; //モンスターの体力を削る
		int[] b = new int[n]; //魔力消費
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
		}
		
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			max = Math.max(max, lcm(a[i],a[i+1]));
		}
		int[] don = new int[n];
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			int llcm = max/a[i];
			don[i] = b[i]*llcm;
			min = Math.min(b[i], min);
		}
		
		Arrays.sort(don);
		int index = 0;
		for(int i = 0; i < n; i++) {
			if(min == b[i]) {
				index = i;
			}
		}
		
		int cnt = 0;
		
		int attack = h / a[index];
		
		int ans = attack * b[index];
		
		if(attack * a[index]== h) {
			System.out.println(ans);
		}else {
			Arrays.sort(b);
			int batack = (h-(a[index]*attack)+b[0]-1)/b[0];
			ans += b[0] * batack;
			System.out.println(ans);
		}
		
	}

}
