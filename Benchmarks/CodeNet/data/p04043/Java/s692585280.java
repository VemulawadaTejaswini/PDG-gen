import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String __[]) {
        int arr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(arr);
        System.out.print(arr[0] == 5 && arr[1] == 5 && arr[2] == 7 ? "Yes" : "No");

    }
}