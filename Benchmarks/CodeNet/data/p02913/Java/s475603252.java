import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = 0;
        char[] s = null;
        boolean scansucceed = false;
        try (Scanner scanner = new Scanner(System.in)) {
            n = Integer.parseInt(scanner.nextLine());
            s = scanner.nextLine().toCharArray();
            scansucceed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!scansucceed)
            System.exit(0);
        int result = 0;
        for (int length = 1;; length++) {
            boolean found = false;
            outerloop: for (int src = 0; src <= s.length - length; src++) {
                for (int dst = src + length; dst <= s.length - length; dst++) {
                    if (submatch(s, src, dst, length)) {
                        found = true;
                        break outerloop;
                    }
                }
            }
            if (!found) {
                break;
            }else{
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean submatch(char[] str, int src, int dst, int length) {
        boolean result = true;
        for (int i = 0; i < length; i++) {
            result &= str[src + i] == str[dst + i];
            if (!result)
                break;
        }
        return result;
    }
}