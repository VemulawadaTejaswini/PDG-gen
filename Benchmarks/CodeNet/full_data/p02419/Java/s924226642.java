import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        String S = sc.next().toUpperCase();
                        int ans = 0;
                        while (true) {
                                String T = sc.next().toUpperCase();
                                if (S.equals(T)) {
                                        ans++;
                                } else if(T.equals("END_OF_TEXT"))break;
                        }
                        System.out.println(ans);
                }
        }
}