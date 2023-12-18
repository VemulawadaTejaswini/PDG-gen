import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());
        Long[] arrays = Arrays.asList(sc.nextLine().split(" ")).stream().map(x -> Long.parseLong(x))
                .toArray(x -> new Long[x]);
        sc.close();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            long Pi = arrays[i - 1];
            boolean isOk = true;
            for (int j = 1; j <= i; j++) {
                long Pj = arrays[j - 1];
                if (Pi > Pj) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                count++;
            }
        }

        System.out.println(count);
    }

}