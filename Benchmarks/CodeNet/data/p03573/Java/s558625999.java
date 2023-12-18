import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(b == c) System.out.println(a);
        else if(c == a) System.out.println(b);
        else System.out.println(c);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
