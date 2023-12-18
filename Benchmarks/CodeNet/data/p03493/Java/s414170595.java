import java.util.*;
public class Main {
    public static void main(String[]aaa){
        Scanner sc = new Scanner(System.in);
        int [] ans = new int[3];
        ans[0] = sc.nextInt();
        
        ans[1] = sc.nextInt();
        
        ans[2] = sc.nextInt();

        sc.close();

        int cnt = 0;

        for (int num:ans){
            if (num == 1){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
       
}