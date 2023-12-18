import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=B-A;
        if(X>=C){
            System.out.println("safe");
        }else{
            System.out.println("delicious");
        }

        }
        
        
    }
