import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(((A>B)&&(B!=1))||((A==1)&&(B!=1))){
            System.out.println("Alice");
        }
        if(A==B){
            System.out.println("Draw");
        }
        if(((A<B)&&(A!=1))||((B==1)&&(A!=1))){
            System.out.println("Bob");
        }
}
        
        
    }
