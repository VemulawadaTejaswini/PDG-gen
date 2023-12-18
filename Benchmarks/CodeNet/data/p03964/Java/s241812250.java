import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		
		int[] T = new int[n];
		int[] A = new int[n];
		for(int i = 0;i < n;i++){
			T[i] =sc.nextInt();
			A[i] = sc.nextInt();
		}
		
		long takahasi = T[0];
		long aoki = A[0];
		for(int i = 1;i < n;i++){
			if(aoki*T[i] != takahasi*A[i]){
				int c = 1;
				while(true){
					
					if(A[i]*c >=  aoki && T[i]*c >= takahasi){
						aoki = A[i]*c;
						takahasi = T[i]*c;
						break;
					}
					
					c++;
				}
			}
			
		}
		
		
		System.out.println(takahasi+aoki);
		
	}
}