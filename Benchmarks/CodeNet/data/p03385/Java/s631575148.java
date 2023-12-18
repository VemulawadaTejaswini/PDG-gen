import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = s+s;
        System.out.println(s2.contains("abc")?"Yes":"No");
    }
}