import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String prev = "";
        String now = "";
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            now += s.substring(i,i+1);
            if(prev.equals(now)){
                continue;
            }else{
                ans++;
                prev = now;
                now = "";
            }
        }
        System.out.println(ans);
    }
}
