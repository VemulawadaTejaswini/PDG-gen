import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Boolean> wordlist = new HashMap<String, Boolean>();

        int N = scan.nextInt();
        String preword = scan.next();
        wordlist.put(preword, true);

        for (int i=1; i<N; i++) {
            String word = scan.next();

            if (wordlist.get(word) == null) {
                wordlist.put(word, true);
            } else {
                System.out.println("No");
                System.exit(0);
            }

            String end = preword.substring(preword.length()-1,preword.length());
            String start = word.substring(0,1);

            if (!end.equals(start)) {
                System.out.println("No");
                System.exit(0);
            }
            preword = word;
        }

        System.out.println("Yes");
    }
}
