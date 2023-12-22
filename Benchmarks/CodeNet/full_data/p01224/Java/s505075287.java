import java.util.Scanner;

public class Main{
	public static int[] prime(int x){
		int[] temp = new int[x];
		temp[0] = 2;
		temp[1] = 3;
		int index = 2;
		for(int i = 5; i < x; i += 2){
			int j = 1;
			double lim = Math.sqrt(i);
			for(; temp[j] <= lim; j++){
				if( i%temp[j] == 0 ){
					break;
				}
			}
			if( temp[j] > lim ){
				temp[index] = i;
				index++;
			}
		}
		int[] p = new int[index];
		System.arraycopy(temp, 0, p, 0, index);
		return p;
	}
				
	public static long calculate(int x, int a){
		long ans = x;
		while( a > 0 ){
			ans *= x;
			a--;
		}
		long result = (ans-1)/(x-1);
		return result;
	}
	
	public static String solve(int n, int[] p){
		String result = new String();
		int[][] divisor = new int[p.length][2];
		int index = 0;
		int temp = n;
		int count = 0;
	
		for(int i = 0; i < p.length && p[i] <= temp; i++){
			count = 0;
			while( temp%p[i] == 0 ){
				temp /= p[i];
				count++;
			}
			if( count > 0 ){
				divisor[index][0] = p[i];
				divisor[index][1] = count;
				index++;
			}
		}
		if( temp > 1 ){
			divisor[index][0] = temp;
			divisor[index][1] = 1;
			index++;
		}
		long ans = 1;
		for(int i = 0; i < index; i++){
			ans *= calculate(divisor[i][0], divisor[i][1]);
		}
		if( ans-n == n ){
			result = "perfect number";
		} else if( ans-n < n ){
			result = "deficient number";
		} else {
			result = "abundant number";
		}
		return result;
	}
			
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] data = new int[101];
		int index = 0;
		int max = 0;
		
		while( (data[index] = stdIn.nextInt()) != 0 ){
			if( data[index] > max ){
				max = data[index];
			}
			index++;			
		}
		int a = (int)Math.sqrt(max);
		int[] p = prime(a);
		
		for(int i = 0; i < index; i++){
			System.out.println(solve(data[i], p));
		}
	}
}