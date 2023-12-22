        import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] a) {
        int highest[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            highest[i] = sc.nextInt();
        }
        Arrays.sort(highest);

        for (int k = 9; k > 6; k--) System.out.println(highest[k]);
    }
}