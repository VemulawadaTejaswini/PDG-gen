import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        for(;;){
            if(C <= B){
                System.out.println("Yes");
                break;
            }
            C = C - B;
          
            if(A <= D){
                 System.out.println("No");
                break;
            }
            A = A - D;
        }
    }
}