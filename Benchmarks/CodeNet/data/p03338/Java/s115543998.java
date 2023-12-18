import java.util.*;

class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void out(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        String str = scan.next();
        int max = 0;

        for (int i = 0; i < (n - 1); i++) {
            String cut1 = str.substring(0, n - i);
            String cut2 = str.substring(n - i);

            HashSet<String> has1 = new HashSet<String>();
            for (int j = 0; j < cut1.length(); j++) {
                has1.add((String.valueOf(cut1.charAt(j))));
            }
            // ArrayList<String> list1 = new ArrayyList<String>(has1);

            HashSet<String> has2 = new HashSet<String>();
            for (int j = 0; j < cut2.length(); j++) {
                has2.add((String.valueOf(cut2.charAt(j))));
            }
            // ArrayList<String> list2 = new ArrayyList<String>(has2);

            has1.retainAll(has2);
            if (has1.size() > max) {
                max = has1.size();
            }
        }
        out(max);
    }
}