import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }

}
