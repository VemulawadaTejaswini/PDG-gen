import java.util.*;

public class Main{

    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int x = scan.nextInt();
        int out = 0;
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                int k = (x - i * 500 - j * 100) / 50;
                if(0 <= k && k <= c) out++;
            }
        }
        System.out.println(out);
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
