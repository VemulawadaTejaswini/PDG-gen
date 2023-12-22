import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();
        long ans = 0;

        for(int l = 0; l < n - 4; l++){
            for(int r = l + 3; r < n; r++){
                long lo = Long.parseLong(s.substring(l, r + 1));
                if(lo % 2019 == 0){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
