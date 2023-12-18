import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N =sc.nextInt();		
			int []A=new int[N];
			int max=-100;
			int min=1000000000;
						
			for(int i=0;i<N;i++){
				A[i]=sc.nextInt();
			}
			for(int i=0;i<N;i++){
				min=Math.min(min,A[i]);
				max=Math.max(max,A[i]);
			}
			System.out.println(max-min);
		}
}