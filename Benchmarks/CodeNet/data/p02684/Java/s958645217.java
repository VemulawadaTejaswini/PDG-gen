import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        sc.nextLine();

        int[] a = new int[n];
        a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] z = new int[n];
        int index = 0;
        int next = 0;
        int startLoop = 0;
        int loopLength = 0;
        boolean looped = false;
        while (!looped) {
            if (next >= a.length) {
                startLoop = 0;
                loopLength = a.length;
                break;
            }
            for (int i = 0; i < index; i++) {
                if (z[i] == a[next]) {
                    startLoop = i;
                    loopLength = index - i;
                    looped = true;
                    break;
                }
            }
            if (!looped) {
                z[index] = a[next];
                index++;
                next = a[index];
            }
        }
        long ansIndex = ((k - startLoop) % loopLength);
        int ans = z[startLoop + (int) ansIndex];

        System.out.println(ans);
    }
}