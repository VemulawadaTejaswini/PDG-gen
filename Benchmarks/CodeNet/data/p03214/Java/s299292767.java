import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;

		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int ave = sum/N;
		int dmin = Integer.MAX_VALUE;
		int frame = -1;
		for(int i=0; i<N; i++){
			int d = Math.abs(ave-a[i]);
			if(dmin>d){
				dmin = d;
				frame = i;
			}
		}
		System.out.println(frame);
	}
}
