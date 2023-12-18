import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        for(int i = 1; i <= 600005; i++){
            String match = String.valueOf((2019*i));
            if(match.indexOf("0") != -1){
                continue;
            }
            int chain = 1;
            int prev = s.indexOf(match);
            while(prev != -1){
                ans++;
                int tmp = s.indexOf(match,prev+1);
                if(tmp == prev+match.length()){
                    chain++;
                }else{
                    ans += fact(chain);
                    chain = 1;
                }
                prev = tmp;
            }
        }
        System.out.println(ans);
    }
    
    public static long fact(int f){
        long ret = 0;
        for(int i = 1; i <= f-1; i++){
            ret += i;
        }
        return ret;
    }
}
