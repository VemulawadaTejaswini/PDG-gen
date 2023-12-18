import java.util.*;
public class Main {
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), D = sc.nextInt();
        long ans = 0;
        for(int d=22;d<=D;d++){
            int ten = d/10, one = d%10;
            if(one>=2&&ten>=2&&one*ten<=m) ans += 1;
        }
        return ans;
    }
}
