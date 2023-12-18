import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean map[][] = new boolean[N][M];

		for(int n=0;n<N;n++){
			for(int m=0;m<M;m++){
				map[n][m] = true;
			}
		}

		for(int n=0;n<N;n++){
			for(int m=0;m<M;m++){		

				if(n!=0 && m!=0)			
				map[n-1][m-1] = !map[n-1][m-1];

				if(n!=0)
				map[n-1][m] = !map[n-1][m];

				if(n!=0 && m!=M-1)
				map[n-1][m+1] = !map[n-1][m+1];

				if(m!=0)
				map[n][m-1] = !map[n][m-1];

				map[n][m] = !map[n][m];

				if(m!=M-1)
				map[n][m+1] = !map[n][m+1];

				if(n!=N-1 && m!=0)
				map[n+1][m-1] = !map[n+1][m-1];

				if(n!=N-1)
				map[n+1][m] = !map[n+1][m];

				if(n!=N-1 && m!=M-1)
				map[n+1][m+1] = !map[n+1][m+1];
			}	
		}

		int count = 0;
		for(int n=0;n<N;n++){
			for(int m=0;m<M;m++){
				if(!map[n][m]) count++;
			}	
		}

		System.out.println(count);

	}
}