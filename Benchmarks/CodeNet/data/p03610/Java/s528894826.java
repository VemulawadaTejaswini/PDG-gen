import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || i % 2 == 0) {
                result.append(ch[i]);
            }
        }
        System.out.println(result);
    }
}
