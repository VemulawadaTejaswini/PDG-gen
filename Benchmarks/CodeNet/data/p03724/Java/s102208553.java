import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[M];
		int[] b = new int[M];
		for(int i=0; i<M; i++){
			a[i]  = sc.nextInt();
			b[i]  = sc.nextInt();
			
		}
		
		int[] count = new int[N+1];
		for(int j=1; j<=N; j++){
			count[j] = 0;
		}
		for(int i=0; i<M; i++){
			for(int j=1; j<=N; j++){
				if(a[i]==j){
					count[j]++;
				}
				if(b[i]==j){
					count[j]++;
				}
			}	
		}
		
		boolean ans = true;
		for(int j=1; j<=N; j++){
			if(count[j]%2 != 0){

				ans = false;
				break;
			}
		}

		if(ans==true){
			System.out.print("YES");
		}else{
			System.out.print("NO");
		}
		
	}

}
