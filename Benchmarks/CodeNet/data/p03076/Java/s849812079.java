import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] times = new int[5];
		int min = 123, ans = 0, sum = 0;

		for(int i=0; i<times.length; i++){
			times[i] = sc.nextInt();
			if((times[i]%10<min) && (times[i]%10!=0)){
				min = times[i]%10;
				ans = i;
			}
		}

		for(int i=0; i<times.length; i++){
			int sub = (times[i] / 10 + 1) * 10;
			if((i == ans) || (times[i]%10 == 0)){
				sum += times[i];
			}else{
				sum += sub;
			}
		}
		System.out.println(sum);
		// System.out.println("min = "+ans+"\nsum = "+sum+"\nans = "+ans);
	}
}