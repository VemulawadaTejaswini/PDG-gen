import java.util.*;

public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int K = sc.nextInt();
		int count =0;
		
		for(int i=0;i<K;i++){
			if(0<A){
			A=A-1;
			count++;
			}
			
			else if(A==0 && 0<B){
				B=B-1;
			}
			
			else if(A==0 && B ==0 && 0<C){
				C=C-1;
				count--;
			}
			
		}
		
		System.out.println(count);
		
	}
}
			