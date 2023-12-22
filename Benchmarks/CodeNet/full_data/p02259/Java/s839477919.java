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
		int A[];
		
		Boolean flag = true;
		
		N = Integer.parseInt(as.next());
		
		A = new int[N];
		
		for(int i=0;i<N;i++){
			
			A[i] = Integer.parseInt(as.next());
			
		}
		
		while(flag){
			
			flag = false;
			for(int j=N-1;j>=1;j--){
				
				if(A[j] < A[j-1]){
					
					tre = A[j];
					A[j] = A[j-1];
					A[j-1] = tre;
					flag = true;
					count++;
					
				}
				
			}
			
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