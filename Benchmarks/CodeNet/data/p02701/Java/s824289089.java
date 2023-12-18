import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<String> S = new ArrayList<String>();
        for (int i = 0; i < N;i++) {
			S.add(sc.next());
        }
        System.out.println(S.size());

    }
}
