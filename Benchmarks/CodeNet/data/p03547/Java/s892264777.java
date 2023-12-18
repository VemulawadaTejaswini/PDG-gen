import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        
        System.out.println(x.compareTo(y)==-1?"<":x.compareTo(y)==0?"=":">");
    }
}
