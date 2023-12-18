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
        long x=sc.nextLong();
        if(a==0){
            if(b==0)out.println(1);
            else out.println((b+1)/x);
        }else{
            out.println((b+1+x-1)/x-(a+x-1)/x);
        }
    }
}