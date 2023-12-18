import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static boolean isComposable(String s, Set<String> dictionary) {
        if (dictionary.contains(s) || s.length() == 0) {
            return true;
        }
        
        for (int i=0; i<s.length(); i++) {
            String curr = s.substring(0, i);
            while (dictionary.contains(curr) && isComposable(s.substring(i), dictionary) ) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Set<String> set = new HashSet<>(Arrays.asList(new String[]{"dream", "dreamer", "erase", "eraser"}));
        boolean canMake = isComposable(s, set);
        System.out.println(canMake ? "YES" : "NO");
    }
