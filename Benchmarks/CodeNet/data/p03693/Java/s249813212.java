import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        solve(r,g,g);
    }
    static void solve(int r, int g, int b){
        if(judge(r,g,b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static boolean judge(int r, int g, int b){
        int tmp = g*10+b;
        if(tmp%4==0)return true;
        return false;
    }
}