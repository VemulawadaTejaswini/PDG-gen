import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long h = sc.nextInt();
        long w = sc.nextInt();
        
        long ans = h/2*w;
        if(h%2==1){
            ans+=1;
        }
        
        System.out.println(ans);
    }
}
