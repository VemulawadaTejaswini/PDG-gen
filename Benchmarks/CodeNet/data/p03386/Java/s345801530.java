import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		if(K > B){
		    K = B - A;
		}

		for(int i = A; i < A + K; i++){
		    if(i > B){break;}
		    System.out.println(i);
		}

		int l = B - A + 1;
		if (K * 2 > l){
		    K = l - K;
		}
		    
		for(int j = B - K + 1; j < B + 1; j++){
		    
		    System.out.println(j);
		}

		if(A == B){System.out.println(A);}
	}
}