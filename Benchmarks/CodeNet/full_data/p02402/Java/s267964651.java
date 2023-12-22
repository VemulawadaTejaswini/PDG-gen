import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        Long total = (long) 0;
        for(int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            total += b[i];
        }
        int max = Arrays.stream(b).max().getAsInt();
        int min = Arrays.stream(b).min().getAsInt();
        //long total = Arrays.stream(b).sum();
        System.out.println(min + " " + max + " " + total);
    }

}
