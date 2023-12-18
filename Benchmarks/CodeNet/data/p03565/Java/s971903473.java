import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ciphered = sc.next();
        String substring = sc.next();

        if (ciphered.length() < substring.length()) {
            System.out.println("UNRESTORABLE");
            return;
        }

        char[] chars = ciphered.toCharArray();
        char[] subChars = substring.toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length - subChars.length + 1; i++) {
            boolean continueFlag = false;
            char[] tmp = ciphered.toCharArray();
            for (int j = 0; j < subChars.length; j++) {
                tmp[i + j] = subChars[j];
            }
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] != '?' && chars[j] != tmp[j]) {
                    continueFlag = true;
                    break;
                }
            }
            if (continueFlag) {
                continue;
            }
            System.out.println(String.valueOf(tmp).replace("?", "a"));
            return;
        }
        System.out.println("UNRESTORABLE");
    }
}
