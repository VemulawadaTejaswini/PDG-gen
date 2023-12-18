import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();
        sc.close();
        Map<String, Integer> alphabetsMap = getAlphabets();
        String[] alphabets = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            String chara = String.valueOf(S.charAt(i));
            int index = alphabetsMap.get(chara) + N;
            if (index > 26) {
                index -= 26;
            }
            sb.append(alphabets[index - 1]);
        }

        System.out.println(sb.toString());
    }

    private static Map<String, Integer> getAlphabets() {
        Map<String, Integer> ret = new HashMap<>();
        ret.put("A", 1);
        ret.put("B", 2);
        ret.put("C", 3);
        ret.put("D", 4);
        ret.put("E", 5);
        ret.put("F", 6);
        ret.put("G", 7);
        ret.put("H", 8);
        ret.put("I", 9);
        ret.put("J", 10);
        ret.put("K", 11);
        ret.put("L", 12);
        ret.put("M", 13);
        ret.put("N", 14);
        ret.put("O", 15);
        ret.put("P", 16);
        ret.put("Q", 17);
        ret.put("R", 18);
        ret.put("S", 19);
        ret.put("T", 20);
        ret.put("U", 21);
        ret.put("V", 22);
        ret.put("W", 23);
        ret.put("X", 24);
        ret.put("Y", 25);
        ret.put("Z", 26);

        return ret;
    }

}