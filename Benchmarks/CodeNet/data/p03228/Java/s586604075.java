import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int C;
		for(int i=0; i<K; i++){
			C = A/2;
			A = B + C;
			B = C;
		}
		if(K%2==1){
			C = A;
			A = B;
			B = C;
		}
		System.out.println(A+" "+B);
		System.out.flush();
		return;
	}
}
