import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 0;
        int tmp = 0;
        while(tmp < b){
            if(ans == 0){
                tmp += a;
            }else{
                tmp += a - 1;
            }
            ans++;
        }
        System.out.println(ans);
    }
}