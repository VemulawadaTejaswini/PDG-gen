import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{

            int cnt = 0;
            String row;

            while ((row = reader.readLine()) != null) {
                if (isPalindrome(row)) {
                    System.out.println(row);
                    cnt++;
                }
            }

            System.out.println(cnt);

        }

        public static boolean isPalindrome(String row) {
            if (row.length() == 1) return true;

            int half = row.length() / 2;
            for (int i=0; i<half; i++) {
                if (row.charAt(i) != row.charAt(row.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }

}