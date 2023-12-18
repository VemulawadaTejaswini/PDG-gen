import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        String ss = s.substring(0, s.length());
        String ts = t.substring(0, s.length());

        if(ss.equals(ts) && s.length()+1 == t.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
