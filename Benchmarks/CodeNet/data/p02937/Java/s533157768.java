import java.util.BitSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine().trim();
        String c = sc.nextLine().trim();

        char[] chars = (m + m).toCharArray();
        BitSet[] indexes = new BitSet[26];
        for (int i = 0; i < chars.length; i++) {
            int ch = chars[i] - 'a';
            BitSet index = indexes[ch];
            if (index == null) index = indexes[ch] = new BitSet(chars.length);
            index.set(i);
        }

        long count = 0;
        int ptr = 0;
        for (char ch : c.toCharArray()) {
            BitSet index = indexes[ch - 'a'];
            if (index == null) {
                System.out.println(-1);
                return;
            }
            
            ptr = index.nextSetBit(ptr + 1);
            if (ptr >= m.length()){
                ptr -= m.length();
                count += 1;
            }
        }

        System.out.println(count * m.length() + ptr + 1);
    }
}