import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a * b / 2);
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
