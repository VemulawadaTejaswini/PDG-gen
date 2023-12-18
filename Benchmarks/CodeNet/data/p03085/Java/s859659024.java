
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Map<Character, Character> map = new HashMap<>();
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('G', 'C');
        map.put('C', 'G');

        System.out.println(map.get(c));
    }
}