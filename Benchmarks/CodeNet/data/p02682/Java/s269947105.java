import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= K;){
            if(A != 0 && K >= A){
                K = K - A;
                count = A;
                A = 0;
            }else if(A != 0 && K < A){
                K = 0;
                count = K;
            }else if(B != 0 && K >= B){
                B = 0;
            }else if(B != 0 && K < B){
                K = 0;
            }else if(C != 0 && K = C){
                count = count - C;
                K = 0;
            }else if(C != 0 && K < C){
                K = 0;
                count = count - K;
            }
        }

        System.out.println(count);
        
	}
}