import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int sum;
        
        if (A > B){
            sum = B;
        }else{
            sum = A;
        }
        
        if (C > D) {
            sum += D;
        }else{
            sum += C;
        }
        System.out.println(sum);
    }
    
}
