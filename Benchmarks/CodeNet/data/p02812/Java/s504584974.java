import java.util.*;
public class task2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String S = s.next();
        String a = "ABC";
        String[] arr = S.split(a);
        System.out.println(arr.length-1);
    }
}