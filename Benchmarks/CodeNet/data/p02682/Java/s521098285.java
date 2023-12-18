import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Long A = scanner.nextLong();
        Long B = scanner.nextLong();
        Long C = scanner.nextLong();
        Long K = scanner.nextLong();
        Long count = 0L;
        for(Long i = 1L; i <= K;){
            if(A != 0 && K >= A){
                K = K - A;
                count = A;
                A = 0L;
            }else if(K < A){
                count = K;
                break;
            }else if(B != 0 && K >= B){
                B = 0L;
                K = K - B;
            }else if(K < B){
                break;
            }else if(C != 0 && K == C){
                count = count - C;
                break;
            }else if(K < C){
                count = count - K;
                break;
            }
        }

        System.out.println(count);
        
	}
}