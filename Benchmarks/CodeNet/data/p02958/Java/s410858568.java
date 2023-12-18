import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int defIdx = -1;
        int defNum = -1;
        boolean swaped = false;
        boolean ans = true;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if(x != i){
                if(swaped){
                    ans = false;
                    break;
                }else{
                    if(defIdx < 0){
                        defIdx = i;
                        defNum = x;
                    }else{
                        if(defIdx == x && i == defNum){
                            swaped = true;
                        }else{
                            ans = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans ? "YES" : "NO");
        sc.close();

    }

}
