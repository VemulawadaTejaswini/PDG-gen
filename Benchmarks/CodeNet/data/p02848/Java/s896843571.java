import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();


        Map<Integer, Character> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        int p = 0;
        for (char a = 'A';a <= 'Z';a++) {
            map2.put(a,p);
            map.put(p++, a);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< s.length(); i++) {
            
            char c = map.get((map2.get(s.charAt(i))+n) % 26);
            //System.out.println(c);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

}
