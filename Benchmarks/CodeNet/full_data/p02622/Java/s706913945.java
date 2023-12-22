import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int tmp = 0;
        int c = 0;
        for(int i=0;i<s.length();i++){
        if (s.charAt(c) != t.charAt(c)) {
            tmp++;
        }
    }
    System.out.println(tmp);
    }
}