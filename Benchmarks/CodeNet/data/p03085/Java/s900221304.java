import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('A','T');
        map.put('T','A');
        map.put('C','G');
        map.put('G','C');
        StringBuilder sb = new StringBuilder();
        for( Character c : s.toCharArray()) {
            sb.append(map.get(c));
        }
        System.out.println(sb.toString());
    }
}
