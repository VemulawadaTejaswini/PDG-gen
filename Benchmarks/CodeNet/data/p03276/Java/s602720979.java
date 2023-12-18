
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int N,K;
	static int[] T;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 K = sc.nextInt();
		 T = new int[N+1];

		 int p = 0;
		 int q = 0 ;
		 for(int i = 0 ; i < N ; i++){
			 T[i]= sc.nextInt();
			 if(T[i]<0){
				 p++;
			 }else if(T[i]>0){
				 q++;
			 }
		 }

		 sc.close();

		 if(N-p-q == 0){
			 T[N] = 0;
			 Arrays.sort(T);
		 }

		 //System.out.println("負数 : "+p);
		 //System.out.println("正数 : "+q);

		 //ゼロの項番
		 int zero = p;



		 int ans = 100000001 ;
		 for(int i = 0 ; i < K ; i++){
			 if(zero-i>=0 && zero+K-i<=N){
				 int pp = Math.abs(T[zero-i])*2 + Math.abs(T[zero+K-i]);
				 //System.out.println("plus pp : "+pp);
				 if(pp < ans){
					 ans = pp;
				 }
			 }
			 else{
				 //System.out.println("plus continue");
				 continue;
			 }
		}
		 for(int i = 0 ; i < K ; i++){

			 if(zero+i<=N && zero-K+i>=0){
				 int pp = Math.abs(T[zero+i])*2 + Math.abs(T[zero-K+i]);
				 //System.out.println("minus pp : "+pp);
				 if(pp < ans){
					 ans = pp;
				 }
			 }
			 else{
				 //System.out.println("minus continue");
				 continue;
			 }
		}
		 System.out.println(ans);


 	}
}