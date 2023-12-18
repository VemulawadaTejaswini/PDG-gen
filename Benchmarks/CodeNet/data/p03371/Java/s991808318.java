import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        boolean kakaku=true;
        if(B>=A){
            kakaku=false;
        }
        boolean maisuu=true;
        if(Y>=X){
            maisuu=false;
        }
        if(maisuu){
            int l=Math.min(2*X*C,X*A+Y*B);
            System.out.println(Math.min(l,2*Y*C+A*(X-Y)));
        }else{
            int l=Math.min(2*Y*C,X*A+Y*B);
            System.out.println(Math.min(l,2*X*C+B*(Y-X)));
        }
        
}
        
        
    }
