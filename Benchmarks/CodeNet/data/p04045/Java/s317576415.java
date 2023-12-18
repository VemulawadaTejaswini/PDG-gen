import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String[] hate = new String[k];
        for (int i = 0; i < k; i++) {
            hate[i] = in.nextLine();
        }
        for (int i = n; i < 10000; i++) {
            String b = Integer.toString(i);
            boolean flag = true;
            for (String m : hate) {
                if (b.contains(m)) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println(b);
              return;
            }

        }


    }

}