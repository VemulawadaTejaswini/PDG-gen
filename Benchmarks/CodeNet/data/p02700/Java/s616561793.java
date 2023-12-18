import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int D =sc.nextInt();
        
        double result1 = A/D;
        double result2 = C/B;
        if(!(A==0)&&!(B==0)){
            if(((result1+1)>=result2||(B==C))&&!(A==D)){
                System.out.println("Yes");
            }else if(A==D){
                System.out.println("No");
            }else{
                System.out.println("No");
            }
        }
        
        
    }
    
    
}
