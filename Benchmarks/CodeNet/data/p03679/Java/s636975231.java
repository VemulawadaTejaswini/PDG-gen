import java.util.*;

public class Main {    
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A - B >= 0){
            System.out.println("deliciouts");
            return;
        }else if(B > A && B <= A + X){
            System.out.println("safe");
            return;
        }else if(B - (A + X + 1) > 0){
            System.out.println("dangerous");
            return;
        }
       
    }        
}        