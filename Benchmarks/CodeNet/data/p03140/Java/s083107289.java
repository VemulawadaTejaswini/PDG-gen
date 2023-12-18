import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        int ans=0;
        for (int i = 0; i < n; i++) {
            HashSet<Character> set=new HashSet<>();
            set.add(a.charAt(i));
            set.add(b.charAt(i));
            set.add(c.charAt(i));
            if(set.size()==2)ans+=1;
            if(set.size()==3)ans+=2;
        }
        out.println(ans);
    }
}