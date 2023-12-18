import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String iro = sc.next();
        int ans = 1;
        for (int i = 0; i < iro.length() -1; i++) {
            char iro1 = iro.charAt(i);
            char iro2 = iro.charAt(i + 1);
            //System.out.println("iro1 "+iro.charAt(i));
            //System.out.println("iro2 "+iro.charAt(i + 1));
            if(iro1 != iro2){
                ans++;
                //System.out.println("ans "+ans);
            }
        }
        System.out.println(ans);
    }
}