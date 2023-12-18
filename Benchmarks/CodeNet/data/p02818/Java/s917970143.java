import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();;
        long B = scanner.nextLong();;
        long K = scanner.nextLong();;
 
        while(!(K == 0L)){
            if(!(A == 0L)){
                K = K - A;
                if(K >= 0L){
                    A = 0L;
                }
            }else{
                if(B >= K){
                    B = B - K;
                    k = 0L;
                }else{
                    B = 0L;
                    K = 0L;
                }
            }
          	K--;
        }
        System.out.print(A);
      	System.out.print(B);
	}
}