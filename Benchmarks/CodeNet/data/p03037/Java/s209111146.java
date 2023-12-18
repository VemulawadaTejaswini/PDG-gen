import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i=0;i<M;i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=1;i<=N;i++) {
			for(int t=0;t<M;t++) {
				if (i<L[t] || i> R[t]){
					break;
				}else if(t < M-1){
					continue;
				}
				count ++;
			}
		}
		System.out.println(count);
		
		sc.close();
		
	}

}