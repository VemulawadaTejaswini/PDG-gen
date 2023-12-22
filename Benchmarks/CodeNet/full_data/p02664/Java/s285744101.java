import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        char[] t = sc.next().toCharArray();
        for (int i = 0; i < t.length; i++) {
            if (t[i] == '?') {
                if (i != 0 && t[i-1] == 'P') {
                    t[i] = 'D';
                } else if (i < t.length-1 && (t[i+1] == 'D' || t[i+1] == '?')) {
                    t[i] = 'P';
                } else {
                    t[i] = 'D';
                }
            }
        }
        System.out.println(String.valueOf(t));
    }
}

