import java.util.*;

public class Main{
    public static void main(String[] args){
        String alp = "abcdefghijklmnopqrstuvwxyz";
        String[] str = alp.split("");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String ans = "";
        while (n > 26){
            int i = (int)(n % 26) - 1;
            if(i < 0){
                i += 26;
            }
            ans += str[i];
            n = n / 26;
            if (n == 27){
                n = 26;
                break;
            }
        }
        ans += str[(int)(n-1)];
        StringBuffer hoge = new StringBuffer(ans);
        String answer = hoge.reverse().toString();
        System.out.println(answer);
    }
}
