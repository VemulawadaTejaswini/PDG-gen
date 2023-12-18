import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c[] = new String[n];
        Set<String> colors = new HashSet<>();
        for (int i=0;i<n;i++){
            c[i] = scanner.next();
            colors.add(c[i]);
        }
        if (colors.size() == 3) {
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }
    }
}