import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //入力数
		int K = sc.nextInt(); //進数	
	
		int count = 0;
		
		while(N > 0){
			N = N / K;
			count++;
		}
		
		System.out.println(count);
	}
}
		