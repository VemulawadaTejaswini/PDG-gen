import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        int n;
        int ans = 0;
        n = Integer.parseInt(sc.next());
        for(int i = 1;i<n;i++){
            int temp = i;
            for(int j = 1;j<n;j++){
                temp = i * j;
                if(temp >= n) break;
                ans ++;
            }
        }
        System.out.println(ans);
    }
}