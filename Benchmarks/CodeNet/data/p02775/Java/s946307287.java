import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int digit = n.length();
        long ans = 0;
        char[] a = n.toCharArray();
        int len = a.length;
        for(int i = 0; i < len; i++){
            int c = a[i] - 48;
            if(c <= 5){
                ans += c;
            }else{
                ans += 10-c+1;
            }
        }
        System.out.println(ans);
    }
}
