import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("BC","*");
        char[] sl = s.toCharArray();
        int ans = 0;
        int chain = 0;
        for(char c: sl){
            if(c == 'A'){
                chain++;
            }else if(c == '*'){
                ans += chain;
            }else{
                chain = 0;
            }
        }
        System.out.println(ans);
    }
}
