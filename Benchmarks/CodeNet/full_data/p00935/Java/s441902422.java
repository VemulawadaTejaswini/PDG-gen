import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[] memo = new int[1000];
	public void run(){
		int n = sc.nextInt();
		calc(n);
	}
	public void calc(int n){
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < 3; j++){
				if(i+j < n){
					sum = sum * 10 + nums[i+j];
					memo[sum] = 1;
				}
			}
		}
		
		for(int i = 0; i < 1000; i++){
			if(memo[i] == 0){
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}