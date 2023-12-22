import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();
        int cnt = 0;

        for (int i=0; i<s.length(); i++) {
            int tmp = s.charAt(i) - 48;
            cnt += tmp;
        }

        if (cnt % 9 ==0) System.out.println("Yes");
        else System.out.println("No");
    }


}

