
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int ret = 0;
            int common = Math.min(x, y);
            
            ret = Math.min(a+b, c*2) * common;
            
            ret += (x - common) * Math.min(a, c*2);
            
            ret += (y - common) * Math.min(b*2, c*2);
            
            //出力
            System.out.println(ret);
            sc.close();
        }
    }
	