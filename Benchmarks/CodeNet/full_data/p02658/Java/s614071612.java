import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] number = new long[N];
      	long ans = 1L;

        for(int i=0; i<N; i++){
        	number[i] = sc.nextLong();
        	if(number[i]==0){
        		System.out.println("0");
        		return;
        	}
		}
        for(int i=0; i<N; i++){
        	ans *= number[i];
          	if((ans<0)||(ans>1000000000000000000L)){
                System.out.println("-1");
                return;
            }

		}

        System.out.println(ans);
    }
}
