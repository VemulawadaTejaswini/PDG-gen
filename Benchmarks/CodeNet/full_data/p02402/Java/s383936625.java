import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long min = 1000000, max = -1000000, sum = 0;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			long a = sc.nextInt();
			sum += a;
			min = Math.min(a, min);
			max = Math.max(a, max);
		}
		
		System.out.println(min + " " + max + " " + sum);
	}
}