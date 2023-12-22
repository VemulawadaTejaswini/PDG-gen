
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int k = sc.nextInt();
    public static void main(String[] args) {
        //重複して入れる
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < k; i++){
            int num = sc.nextInt();
            for (int j = 0; j < num; j++){
                set.add(sc.next());
            }
        }
        System.out.println(n - set.size());
    }

}
