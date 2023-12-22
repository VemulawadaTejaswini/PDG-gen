import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        String t = sc.next();
        char[] m1 = new char[s.length()];
        char[] m2 = new char[s.length()];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            m1[i] = s.charAt(i);
            m2[i] = t.charAt(i);
            if(!(m1[i] == m2[i]))
            count++;
        }
        System.out.println(count);
    }
}