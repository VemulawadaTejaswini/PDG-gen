import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - Stones

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        char[] c = s.toCharArray();
        
        int count = 0;
        boolean isBlack = false;
            
        for (int i = 0; i < n; i++) {
            if (c[i] == '#') {
                isBlack = true;
            } else if (isBlack) {
                ++count;
            }
        }

        System.out.println(count);
    }

}