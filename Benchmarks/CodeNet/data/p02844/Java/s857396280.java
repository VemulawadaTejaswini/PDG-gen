import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int count = 0;
                    for (int l = 0 ; l < n ; l++) {
                        int t = Integer.valueOf(s.substring(l, l+1));
                        if (count == 0) {
                            if (i == t) count++;
                        } else if (count == 1) {
                            if (j == t) count++;
                        } else if (count == 2) {
                            if (k == t) count++;
                        }
                    }
                    if (count == 3) c++;
                }
            }
        }

        System.out.println(c);
    }

}
