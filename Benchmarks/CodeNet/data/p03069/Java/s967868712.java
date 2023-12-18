import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - Stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        char[] c = s.toCharArray();
        
        int min = n;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    if (c[j] == '#') ++count;
                } else {
                    if (c[j] == '.') ++count;
                }
            }
            
            if (min > count) min = count;
        
        }
        
        System.out.println(min);
    }
}