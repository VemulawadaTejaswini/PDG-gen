import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int a=sc.nextInt();
        String op=sc.next();
        int b=sc.nextInt();
        if(op.equals("+"))out.println(a+b);
        else out.println(a-b);
    }
}