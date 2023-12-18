import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[s.nextInt()];
        for (int i = 0; i < a.length; ++i) {
            a[i] = s.nextInt() - 1;
        }
        int count = 0;
        for( int i  = 0; i < a.length; ++i) {
            for(int j = i + 1; j < a.length; ++j) {
                if (a[i] == j && i == a[j]) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
