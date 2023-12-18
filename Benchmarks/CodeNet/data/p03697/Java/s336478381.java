import java.util.*;
  
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
     
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if(A + B < 10)
            System.out.println(A + B);
        else
            System.out.println("error");
    }
}