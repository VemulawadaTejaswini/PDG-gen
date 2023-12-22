import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= K; i++){
            if(A != 0){
                count++;
                A--;
            }else if(B != 0){
                B--;
            }else if(C != 0){
                C--;
                count--;
            }
        }

        System.out.println(count);
        
	}
}