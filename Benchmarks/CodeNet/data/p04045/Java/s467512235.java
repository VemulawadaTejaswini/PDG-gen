import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static boolean[] x;
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int k = sc.nextInt();
		
		int n = N.length();
		
		String[] a = new String[n];
		int[] b = new int[n+1];
		int[] ai = new int[n];
 		x = new boolean[10];
		
		for(int i=0; i<n; i++) a[i] = N.substring(i, i+1);
		for(int i=0; i<n; i++) ai[i] = Integer.parseInt(a[i]);
		
		for(int i=0; i<k; i++){
			x[sc.nextInt()] = true;
		}
		
		boolean down = false;
		boolean ketaage = false;
		
		int num;
		
		for(int i=0; i<N.length(); i++){
			if((num = can_put(ai[i], down)) < 10){
				if(num != ai[i]) down = true;
				b[i+1] = num;
			}else{
				if(i == 0){
					ketaage = true;
				}
				down = true;
				b[i]++;
				if(b[i] > 1){
					ketaage = true;
					b[i] = can_put(b[i], down);
				}
				i--;
			}
		}
		
		int ans = 0;
		
		for(int i=0; i<n; i++){
			ans += b[i+1]*Math.pow(10, n-i-1);
		}
		if(ketaage == true)
			ans += Math.pow(10, n);
		
		System.out.println(ans);
		
		
		sc.close();
	}
	
	static int can_put(int n, boolean down){
		if(down == false){
			while(n != 10){
				if(x[n] != true)
					break;
				n++;
			}
			return n;
		}else{
			n=0;
			while(x[n] == true){
				n++;
			}
			return n;
		}
	}
}
