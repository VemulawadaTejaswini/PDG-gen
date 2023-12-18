import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int m = Integer.parseInt(stdIn.next());
        int[] p = new int[m];
        String[] s = new String[m];
        int ac = 0;
        int wa = 0;
        boolean[] acList = new boolean[n];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(stdIn.next());
            s[i] = stdIn.next();
            if (!acList[p[i] - 1] && s[i].equals("AC")) {
                ac++;
                acList[p[i] - 1] = true;
            }
        }

        boolean[] notCount = new boolean[n];
        for (int i = 0; i < m; i++) {
            if (!notCount[p[i] - 1] && acList[p[i] - 1] && s[i].equals("WA")) {
                wa++;
            } else if (!notCount[p[i] - 1] && s[i].equals("AC")) {
                notCount[p[i] - 1] = true;
            }
        }

        System.out.println(ac + " " + wa);
    }
}