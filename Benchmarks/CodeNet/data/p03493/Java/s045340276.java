import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.nextLine();
        int count = 0;

        for (int i = 0; i < 3; i++)
            if (s.charAt(i) == '1') {
                count++;
            }

        System.out.println(count);
    }
}