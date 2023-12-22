import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }else if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            System.out.print(c);
        }
        System.out.println();
    }
}
