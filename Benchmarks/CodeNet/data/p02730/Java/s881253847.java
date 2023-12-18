import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        String s1 = s.substring(0, (length-1)/2);
        String s2 = s.substring((length-1)/2+1);
        System.out.println(s1.equals(s2)?"Yes":"No");
    }
}