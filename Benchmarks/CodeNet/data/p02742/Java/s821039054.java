import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long S= H*W;
        if(S%2==0){
            System.out.println(S/2);
        }else{
            System.out.println((S+1)/2);
        }
        
    }
}
