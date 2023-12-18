import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<String> map = new HashSet<String>();
        String prev = null;
        for (int i = 0; i < N; i++) {
            String word = sc.next();
            if (map.contains(word)) {
                System.out.println("No"); return;
            }
            if (prev != null) {
                if (prev.charAt(prev.length()-1) != word.charAt(0)) {
                    System.out.println("No"); return;
                }
            }
            map.add(word);
            prev = word;
        }
        System.out.println("Yes");
    }
}