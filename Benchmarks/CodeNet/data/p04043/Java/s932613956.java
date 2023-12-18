import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String __[]) {
        int array [] = {sc.nextInt(),sc.nextInt(),sc.nextInt() };
        Arrays.sort(array);
        System.out.print(array[0] == 5 && array[1] == 5 && array[2] == 7 ? "Yes" : "No");

    }
}