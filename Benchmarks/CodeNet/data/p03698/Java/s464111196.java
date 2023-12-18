import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> input = new HashSet<>();
        char[] S = scan.next().toCharArray();
        for (char temp : S) {
            if (input.contains(temp)){
                System.out.println("no");
                return;
            }
            input.add(temp);
        }
        System.out.println("yes");
    }
}