import java.util.*;

class Main{

    int cnt;

    void solve(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt(), y =sc.nextInt();
            if(x==0 && y==0) break;
            if(x<y){
                int tmp = x;
                x = y; y = tmp;
            }
            cnt = 0;
            System.out.println(yu(x, y)+" "+cnt);
        }
    }

    int yu(int x, int y){
        if(y==0) return x;
        x = x % y;
        cnt++;
        return yu(y, x);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}