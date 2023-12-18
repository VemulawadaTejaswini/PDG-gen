import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		int[] A = new int[N+1];
		A[0] = -1;
		for(int i=1;i<N+1;i++){
			A[i] = scan.nextInt();
		}
		int count = 0;
		int min, max, gain;
		min = max = A[1];
		gain = -1;
		for(int i=2;i<N+1;i++){
			min = Math.min(min, A[i]);
			if(min==A[i]){
				max = A[i];
			}
			max = Math.max(max, A[i]);
			if(i==N){
				if(gain < max-min){
				//	System.out.println(min+","+max);
					gain = max-min;
					count = 1;
					break;
				}
				if(gain==max-min){
				//	System.out.println(min+","+max);
					count++;
					break;
				}
				break;
			}
			if(max>A[i+1]){
				if(gain < max-min){
				//	System.out.println(min+","+max);
					gain = max-min;
					count = 1;
					max = A[i+1];
					min = A[i+1];
					i++;
					continue;
				}
				if(gain==max-min){
				//	System.out.println(min+","+max);
					count++;
				}
				max = A[i+1];
				min = A[i+1];
				i++;
			}
		}
		System.out.println(count);
	}
}
