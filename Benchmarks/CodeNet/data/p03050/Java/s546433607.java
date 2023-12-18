import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long output = 0;
        long favoritCount = 1;
        while (1 == 1) {
            if (N % favoritCount != 0) {
                favoritCount++;
                continue;
            }

            long favoritCandidate = (N / favoritCount) - 1;

            if (favoritCandidate < favoritCount) {
                break;
            }
            output += favoritCandidate;
            favoritCount++;
        }

        System.out.println(output);
    }
}
