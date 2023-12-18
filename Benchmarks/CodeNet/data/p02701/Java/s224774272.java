import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if(n<=1){
            System.out.println(n);
            return;
        }
        HashSet<Long> count = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            long a = 0;
            for (char c : s.toCharArray()) {
                a = a*26+c-'a';
            }
            count.add(a);
        }
        System.out.println(count.size());
    }
}
