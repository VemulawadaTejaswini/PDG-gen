import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long SI = 1_000_000_007;
		
		int length = sc.nextInt();
		int count = sc.nextInt();
		int[] A = new int[length];
		for(int i=0;i<length;i++) {
			A[i] = sc.nextInt();
		}
		
		long single = 0; //一つの配列の中で発生する転倒数
		long second = 0; //二つの配列の間で発生する転倒数
		
		for(int i=0;i<length-1;i++) {
			for(int p=1;p+i<length;p++) {
				if(A[i]>A[i+p])single++;
			}
		}
		
		for(int i=0;i<length;i++) {
			for(int p:A) {
				if(A[i] > p)second++; 
			}
		}
		
		single = single*count;
		second = second* ((count*(count-1))/2);
		
		long answer = (single+second)%SI;
		System.out.println(answer);
		
		
		sc.close();	
	}
}