import java.util.*;

	public class Main {

		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] H = new int[N];
        int sum = 1;
        H[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
		  H[i] = sc.nextInt();
          if(H[i-1]==H[i] || H[i-1]<H[i]){
              sum++;
            }
          else if(H[i-1]-1==H[i]){
             int sum2 = 0;
           	 for(int j = i-2; j >= 0 ; j--){
            	   if(H[i-1]-1==H[j] || H[i-1]-1<H[j]){
            	     sum2++;
            	   }else{
                     break;
                   }
          	  }
             	if(sum2-1 == i-2){
             	  sum++;
            	 }
          }
          else{
            break;
          }
        }
          
          if(sum == N){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }       
	}
}