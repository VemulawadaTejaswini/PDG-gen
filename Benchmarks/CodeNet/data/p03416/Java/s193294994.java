import java.math.*;
import java.util.*;

public class Main {
    static boolean loop(int a) {
        String str = Integer.toString(a);
        int tmp =0;
        if(str.length()%2==0){
            tmp = str.length()/2;
        }
        else {
            tmp = (str.length()- 1) / 2;
        }
        boolean isLoop = true;
        for (int i = 0; i < tmp; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isLoop = false;
                break;
            }
        }
        return isLoop;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (loop(i))
                cnt++;
        }
        System.out.println(cnt);
    }
}
