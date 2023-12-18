import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long k=sc.nextLong();
        for (int i = 0; i <k ; i++) {
            if(i%2==0){
                if(a%2==1){
                    a--;
                }
                a/=2;
                b+=a;
            }else{
                if(b%2==1){
                    b--;
                }
                b/=2;
                a+=b;
            }
        }
        out.println(a+" "+b);
    }
}