//https://onlinejudge.u-aizu.ac.jp/#/problems/ALDS1_3_A
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        ArrayDeque<String> stack=new ArrayDeque<>();
        while (sc.hasNext()){
            String s=sc.next();
            switch (s){
                case "+":
                    stack.push(String.valueOf(Long.parseLong(stack.pop())+Long.parseLong(stack.pop())));
                    break;
                case "-":
                    stack.push(String.valueOf(-Long.parseLong(stack.pop())+Long.parseLong(stack.pop())));
                    break;
                case "*":
                    stack.push(String.valueOf(Long.parseLong(stack.pop())*Long.parseLong(stack.pop())));
                    break;
                default:
                    stack.push(s);
                    break;
            }
        }
        out.println(stack.pop());
    }
}
