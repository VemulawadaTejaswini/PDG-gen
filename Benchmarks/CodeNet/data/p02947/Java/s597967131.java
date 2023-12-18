import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String line;
        String[] sline = new String[10];

        int[] rslt = new int[N];

        line = sc.nextLine();

        for (int i = 0; i < N; i++) {
            line = sc.nextLine();
            sline = line.split("");
            for (int j = 0; j < 10; j++) {
                rslt[i] += sline[i].toCharArray()[0];
            }
        }
        rslt[N - 1] = rslt[N - 1] - 10;

        long count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = N-i+1; j < N; j++) {
                 if (rslt[i] == rslt[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}