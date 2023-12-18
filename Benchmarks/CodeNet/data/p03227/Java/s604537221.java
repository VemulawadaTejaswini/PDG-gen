import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int length = S.length();
        if(length == 2) {
            char [] array = S.toCharArray();
            for (int i = 2; i >=0; i --) {
                 System.out.print(array[i]);
            }
        } else {
                System.out.println(S);
        }
    }
}