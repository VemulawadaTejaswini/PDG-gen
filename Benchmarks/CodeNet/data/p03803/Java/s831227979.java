import java.util.*;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       System.out.println(A);
       System.out.println(B);
       if(A == 1 || B == 1){
        if((A == 1) && (B != 1)){
             System.out.println("Alice");
        }else if(A == 1 && B == 1){
             System.out.println("Draw");
        }else{
             System.out.println("Bob");
        }
    }else{
        if(A > B){
            System.out.println("Alice");
        }else if(A == B){
            System.out.println("Draw");
        }else{
            System.out.println("Bob");
        }
    }  
}
}   