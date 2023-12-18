import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = scan.nextLong();
        if(x == y){
            System.out.println(1);
            return;
        }
        for(int i = 1; ; i++){
            if(x * Math.pow(2, i) > y){
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
