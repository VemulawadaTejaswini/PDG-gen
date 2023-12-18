import java.util.*;

class Main {
    public static void main(String args[]) {
        String boin[] = {"a", "i", "u", "e", "o"};
        Scanner inp = new Scanner(System.in);
        String c = inp.next();
        inp.close();
        for (int i = 0; i < 5; i++) {
            if (boin[i].equals(c)) {
                System.out.println("vowel");
                return;
            }
        }
        System.out.println("consonant");
    }
}