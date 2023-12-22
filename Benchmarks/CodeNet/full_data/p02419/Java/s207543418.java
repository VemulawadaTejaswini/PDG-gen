import java.util.*;

public class Main{
    public static void main(String[] args){
        int count=0;
        Scanner s = new Scanner(System.in);
        String w = s.next();
        while(true){
            String t = s.next();
            if (t.equals("END_OF_TEXT")) break;
            t = t.toLowerCase();
            if (t.equalsIgnoreCase(w)) count++;
        }
        System.out.println(count);
    }
}
