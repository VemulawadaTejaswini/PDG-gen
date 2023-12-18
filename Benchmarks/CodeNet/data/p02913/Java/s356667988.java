import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int answer = 0;
        for(int i = 0; i< n; i++ ) {
            for (int j = i + 1; j <= n; j++) {
                String base = s.substring(i, j);
                String replace = s.replaceAll(base, "★");

                long count = replace.chars().filter(ch -> ch == '★').count();
                if (count > 1) {
                    if (answer < base.length()) {
                        answer = base.length();
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
