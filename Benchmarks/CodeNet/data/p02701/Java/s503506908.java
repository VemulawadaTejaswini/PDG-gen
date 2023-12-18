import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        Set<String> presents=new HashSet<>();
        for (int i = 0; i < N; i++) {
            presents.add(sc.next());
        }
        System.out.println(presents.size());
    }
}