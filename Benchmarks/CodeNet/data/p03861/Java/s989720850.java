import java.util.*;
import java.util.Arrays;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long x=sc.nextLong();
        int sum=0;
        for(int i=a;i<=b;i++){
            if(i%x==0){
                sum++;
            }
        }
        System.out.println(sum);
        
        
}
        
        
    }
