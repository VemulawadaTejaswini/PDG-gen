import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){
		int N = in.nextInt(), C  = in.nextInt(), K = in.nextInt();
		int[] t = new int[N];
		for(int i = 0; i < N; i++){
			t[i] = in.nextInt();
		}
		Arrays.sort(t);
		int bus = 0, time = 0, sum = 1;
		for(int i = 0; i < N; i++){
			if(i == 0){
				time = t[i];
				bus++;
			}else if(t[i] <= time + K && bus < C){
				bus++;
			}else{
				sum++;
				bus = 1;
				time = t[i];
			}
		}
		System.out.println(sum);
		
	}
}