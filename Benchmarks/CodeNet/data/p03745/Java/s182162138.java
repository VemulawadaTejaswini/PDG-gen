import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dir = 0;
        int pre = 0;
        int ans =0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(dir < 0){
                if(pre < a){
                    ans++;
                    dir = 0;
                }
            }else if(0 < dir){
                if(a < pre){
                    ans++;
                    dir = 0;
                }
            }else{
                if(pre < a) dir = 1;
                else if(a < pre) dir = -1;
            }
            pre = a;
        }
        if(ans != 0) ans++;
        System.out.println(ans);
        sc.close();

    }

}
