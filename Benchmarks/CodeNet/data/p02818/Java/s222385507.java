import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if(a>k){
            System.out.println(String.format("%d %d",a-k,b));
        }
        
        else{
            System.out.println(String.format("%d %d",0,Math.max(b+a-k,0)));
        }
    }
}

