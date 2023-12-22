import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		
		int N = 0;
		int tre = 0;
		int count = 0;
		int minj = 0;
		int A[];
		
		N = Integer.parseInt(as.next());
		
		A = new int[N];
		
		for(int i=0;i<N;i++){
			
			A[i] = Integer.parseInt(as.next());
			
		}
		
		for(int i=0;i<=N-1;i++){
			
			minj = i;
			for(int j=i;j<=N-1;j++){
				
				if(A[j] < A[minj]){
					
					minj = j;
					
				}
				
			}
			
			tre = A[i];
			A[i] = A[minj];
			A[minj] = tre;
			if(i != minj)
				count++;
			
		}
		
		for(int i=0;i<N;i++){
			
			if(i != N-1){
				
				sb.append(A[i]).append(' ');
			
			}
			else{
				
				sb.append(A[i]);
				
			}
		}
		System.out.println(sb.toString());
		sb.setLength(0);
		sb.append(count);
		System.out.println(sb.toString());

	}

}