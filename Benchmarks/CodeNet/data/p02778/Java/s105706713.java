import java.util.Scanner;

public class Test44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        StringBuilder t = new StringBuilder();
        for(int i = 0; i < len; i++){
            t.append("x");
        }
        System.out.println(t);
    }
}
