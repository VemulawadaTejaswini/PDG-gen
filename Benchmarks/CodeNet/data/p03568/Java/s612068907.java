import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int dec = 1;
        for(int i = 0; i < n; i++) if(scan.nextInt() % 2 == 0) dec *= 2;
        System.out.println((int)Math.pow(3, n) - dec);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
