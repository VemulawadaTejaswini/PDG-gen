import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x[] = new int[N];

		for(int n=0;n<N;n++){
			int v = sc.nextInt();
			x[n] = v;
		}

		Arrays.sort(x);

		int max = x[N-1];
		long dist = -1;

		int t=-1;
		for(int n=0;n<N;n++){
			System.out.println(dist);
			if(dist == -1){
				dist = Math.abs((long)max/2-x[n]);
				t = x[n];
			}
			else if(dist > Math.abs((long)max/2-x[n])){
				dist = Math.abs((long)max/2-x[n]);
				t = x[n];
			}
			if(x[n] > (long)max/2) break;
		}
		System.out.println(max+" "+t);
	}
}