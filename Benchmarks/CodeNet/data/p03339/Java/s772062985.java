import java.util.*;

public class Main {

    int N;
    String S;
    int[] array;

    public Main() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'E') {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }

    public void run() {
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        int min = count;
        for (int i = 1; i < N; i++) {
            if (array[i-1] == 0 && array[i] == 0) {
                count--;
            } else if (array[i-1] == 0 && array[i] == 1) {

            } else if (array[i-1] == 1 && array[i] == 0) {

            } else {
                count++;
            }
            if (min > count) {
                min = count;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

}
