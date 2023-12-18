import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> A = new ArrayList<String>();
        int i;
        for (i = 0; i < N; i++) {
            A.add(sc.next());
            if (A.indexOf(A.get(i)) != i) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
