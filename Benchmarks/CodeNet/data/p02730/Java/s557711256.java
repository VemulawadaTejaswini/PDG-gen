import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        String r = sb.reverse().toString();

        if(s.equals(r)){
            s = s.substring(0, (s.length() - 1) / 2);
            sb = new StringBuffer(s);
            r = sb.reverse().toString();
            if(s.equals(r)){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");

    }
}
