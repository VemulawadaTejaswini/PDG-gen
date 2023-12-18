import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int out = 0;
        for(int i = 1; i <= n; i += 2){
            if(isTrue(i)) out++;
        }
        System.out.println(out);
        scan.close();
    }
    
    public static boolean isTrue(int n){
        int c = 0;
        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0) c++;
            if(c > 4) return false;
        }
        if(n % Math.sqrt(n) == 0) c++;
        if(c == 4) return true;
        else return false;
    }
}
