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
                count = K;
                break;
            }else if(B != 0 && K >= B){
                B = 0;
                K = K - B;
            }else if(B != 0 && K < B){
                K = 0;
                break;
            }else if(C != 0 && K == C){
                count = count - C;
                break;
            }else if(C != 0 && K < C){
                count = count - K;
                break;
            }
        }

        System.out.println(count);
        
	}
}