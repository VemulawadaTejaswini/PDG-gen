import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        List<Boolean> snuke = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            snuke.add(false);
        }
        int di,aii;
        for (int i = 0; i < k; i++) {
            di = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < di; j++) {
                aii = scanner.nextInt();
                snuke.set(aii-1,true);
            }
            scanner.nextLine();
        }
        int ret = 0;
        for (Boolean aBoolean : snuke) {
            if (!aBoolean) ret++;
        }
        System.out.println(ret);
    }
}