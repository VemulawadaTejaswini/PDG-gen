import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] input = new int[n];
		
		for(int i = 0; i < n; i++){
			input[i] = sc.nextInt();
		}
		
		Arrays.sort(input);
		
//		long lcmAll = input[0];
//		
//		for(int i = 1; i < n; i++){
//			lcmAll = lcm(input[i], lcmAll);
//		}
		
		long lcm2 = lcm(input[n - 1], input[n - 2]);
		//debug
//		System.out.println(lcmAll);
		
		System.out.println(solve2(input));
//		long result = 0;
//		for(int i = 1; i < 1000; i++){
//			long number = lcm2 * i - 1;
//			result = Math.max(result, calcWorst(number, input));
//			System.out.println("i = "+i+" number = " + number+ " " +calcWorst(number, input)+" max = "+result);
//			
//		}
//		long result = 0;
//		for(int i = 0; i < n; i++){
//			result += (lcmAll - 1)%input[i];
//		}
//		System.out.println(result);
	}

	static long calcWorst(long x, int[] mods){
		long result = 0;
		
		for(int i = 0; i < mods.length ; i++){
			result += x%mods[i];
		}
		
		return result;
	}
	
	static long solve2(int[] mods){
		long lcm[] = new long[mods.length - 1];
		
		for(int i = 0; i < mods.length - 1; i++){
			lcm[i] = lcm(mods[i], mods[i + 1]);
		}
		
		long x[] = new long[mods.length];
		Arrays.fill(x, 1);
		
		for(int i = 0; i < mods.length ; i++){
			
			for(int j = 0; j < lcm.length ; j++){
				x[i] *= lcm[j];
				x[i] %= mods[i];
			}
			
			x[i]--;
			if(x[i] < 0){
				x[i] += mods[i];
			}
		}
		
		long result = 0;
		
		for(int i = 0; i < x.length ; i++){
			result += x[i];
		}
		
		return result;
	}
	
	static long gcd(long a, long b){
        long tmp;
 
        while (a % b != 0)
        {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return b;
    }
 
    static long lcm(long a, long b, long gcd){
        return a*(b/gcd);
    }
 
    static long lcm(long a, long b){
        long g = gcd(a, b);
 
        return lcm(a,b,g);
    }
}

