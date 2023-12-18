import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = 0;
        int B = 0;
        
        int[] C = new int[65];
        for(int i = 0; i < 65 ; i++){
            C[i] = (i + 1) * (i + 1) * (i + 1) * (i + 1) * (i + 1);
        }
        
        for(int i = 65; i > 0; i--){
            if(X > C[i - 1]){
                A = i;
                break;
            }
        }
        
        X = X - (A * A * A * A * A);
        for(int i = 65; i > 0; i--){
            if(X == C[i - 1]){
                B = - i;
                break;
            }
        }
        
        System.out.println(A + " " + B);
    
    }
}
