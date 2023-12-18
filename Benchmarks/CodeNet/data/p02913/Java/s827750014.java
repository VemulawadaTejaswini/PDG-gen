import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        String S;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();

        }
        //len(暫定値)
        int NStart = 0;
        int NEnd = N;
        int window =0;
        int result = 0;
        while (true) {

            window = (NEnd + NStart) / 2;

            //探索
            boolean check = chackSub(S, window);
            if (check) {
                result = window;
                NStart = window;
            } else {
                NEnd = window;
            }
            if(NEnd - NStart  <=1){
                break;
            }
        }

        System.out.println(result);
    }

    private static boolean chackSub(String S, int window) {
        int i = 0;
        while (true) {
            int start = i;
            int end = start + window;

            if (end + window > S.length()) {
                break;
            }
            String sub1 = S.substring(start, end);
            String sub2 = S.substring(end+1);

            if (sub2.contains(sub1)) {
                return true;
            }
            i++;
        }
        return false;
    }
}
