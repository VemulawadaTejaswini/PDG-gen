import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x == y){
            System.out.println(0);
            return;
        }
        if(x < 0 && y < 0){
            if(x < y) System.out.println(y - x);
            else System.out.println(x - y + 2);
        }else if(x < 0 && y >= 0){
            if(-x < y){
                System.out.println(-x - y + 1);
            }else if(-x == y){
                System.out.println(1);
            }else{
                System.out.println(y + x + 1);
            }
        }else if(x >= 0 && y < 0){
            System.out.println(Math.abs(-y - x) + 1);
        }else{
            System.out.println(Math.abs(x - y));
        }
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
