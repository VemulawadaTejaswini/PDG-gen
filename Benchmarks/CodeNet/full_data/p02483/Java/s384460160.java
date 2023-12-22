import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] ary = {a, b, c};
        Arrays.sort(ary);
        System.out.printf("%d %d %d\n", ary[0], ary[1], ary[2]);
    }
}