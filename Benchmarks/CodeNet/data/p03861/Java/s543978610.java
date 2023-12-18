import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        long x = Long.parseLong(sc.next());
        
        long ans = 0;
        for(long i=a; i<=b; i++){
            if(i % 2 == 0){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}