import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        int k = Integer.parseInt(sc.next());
        
        for(int i = 0; i < k; i++){
            if(i % 2 == 0){
                if(a % 2 != 0){
                    a--;
                }
                b+=a/2;
                a/=2;
            }else{
                if(b % 2 != 0){
                    b--;
                }
                a+=b/2;
                b/=2;
            }
        }
        System.out.println(a + " " + b);
    }
}
