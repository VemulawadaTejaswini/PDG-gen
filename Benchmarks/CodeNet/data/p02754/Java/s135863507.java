import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        List<String> list = new ArrayList<>();
        while (list.size() < N) {
            for (int i = 0; i < A;i++) {
                list.add("青");
                count++;
                if (list.size() == N) break;
            }
            for (int i = 0; i < B;i++) {
                list.add("赤");
            }
        }
        System.out.println(count);
    }
}