import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        String s2 = sc.next();

        //String s = String.valueOf(i);
        int i = Integer.parseInt(s);
        int i2 =Integer.parseInt(s2);
        //System.out.println((s + s).contains(s2) ? "Yes" : "No");
        System.out.println(i+i2/2);
    }
}