import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long d = scan.nextInt();
        if(b <= 0 && c <= 0){
            System.out.println(a * c);
        }else if(b <= 0 && c > 0){
            System.out.println(b * c);
        }else if(d <= 0 && a <= 0){
            System.out.println(a * c);
        }else if(d <= 0 && a > 0){
            System.out.println(a * d);
        }else{
            System.out.println(b * d);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
