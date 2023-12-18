import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long[] array = new long[s.length() + 1];
        for (int j = 1; j <= s.length(); j++) {
            if (s.charAt(j - 1) == '<') {
                array[j] = array[j - 1] + 1L;
            }
        }
        long answer = array[s.length()];
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == '>') {
                array[j] = Math.max(array[j], array[j + 1] + 1);
            }
            answer += array[j];
        }
        System.out.println(answer);
    }
}
