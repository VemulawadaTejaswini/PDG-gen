import java.util.*;

public class Main{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		if(B-A-1 > 2*K ){
			for(int i=0;i<K;i++){
				System.out.println(A+i);
			}
			for(int j=0;j<K;j++){
				System.out.println(B-K+j+1);
			}
		}else{
			for(int m=0;m<B-A+1;m++){
				System.out.println(A+m);
			}
		}
	}	
}