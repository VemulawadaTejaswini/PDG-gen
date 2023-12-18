import java.util.*;
public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(sc.nextInt() >= k)
                cnt++;
        }

        System.out.println(cnt);
    }

}