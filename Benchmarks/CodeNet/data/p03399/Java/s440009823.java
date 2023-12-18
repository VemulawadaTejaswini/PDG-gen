import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        System.out.println(Math.min(scan.nextInt(), scan.nextInt()) + Math.min(scan.nextInt(), scan.nextInt()));
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
