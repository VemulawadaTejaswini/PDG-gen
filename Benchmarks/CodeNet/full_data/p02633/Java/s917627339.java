import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i = 1;; i++){
            if(x * i % 360 == 0){
                System.out.println(i);
                return;
            }
        }
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}