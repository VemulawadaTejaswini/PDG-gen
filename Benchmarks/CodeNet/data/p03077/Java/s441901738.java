import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long n[] = new long[5];
		long min = 1000000000000000L;
		for(int i = 0; i < 5; i++){
			n[i] = sc.nextLong();
			if(n[i] < min){
				min = n[i];
			}
		}
		
		long x;
		if(N <= min){
			x = 1;
		}else if(N % min == 0){
			x = N / min;
		}else{
			x = N / min + 1;
		}
		
		System.out.println(4+x);
	}
}