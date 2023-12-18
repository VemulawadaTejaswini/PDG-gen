import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	
	void run(){
		int n = sc.nextInt();
		
		solve(n);
	}
	void solve(int n){
		int[] ans = new int[n];
		int count = 64;
		ans[0] = 2;
		ans[1] = 5;
		ans[2] = 63;
		
		int sum = 70;
		if(n == 3){
			System.out.println("2 5 63");
			return;
		}
		if(n==4){
			System.out.println("2 5 63 80");
			return;
		}
		if(n == 5){
			System.out.println("2 5 63 64 76");
			return;
		}
		
		for(int i = 3;i < n-2; i++){
			for(;count % 2 != 0 && count % 5 != 0 && count % 3 != 0;count++){}
			ans[i] = count;
			sum += count;
			sum %= 30;
			count++;
		}

//		System.out.println("   "+count+" "+sum);

		for(;count % 2 != sum%2 || count % 5 != 0 && count % 3 != 0;count++){}
		ans[n-2] = count;
		sum += count;
		sum %= 30;
		count++;
		
//		System.out.println("   "+count+" "+sum);
		
//		for(;(count % 2 != 0 && count % 5 != 0 && count % 3 != 0) || (count+sum)%30 != 0;count++);
		ans[n-1] = count + 30 - ((count+sum)%30);
		
		long mysum = 0;
		for(int i = 0;i < n-1; i++){
			System.out.print(ans[i]);
			System.out.print(" ");
			mysum += ans[i];
//			System.out.println();
		}
		System.out.println(ans[n-1]);
//		System.out.println(ans[n-1]);
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
		}
}