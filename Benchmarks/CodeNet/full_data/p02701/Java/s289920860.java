import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<String> S = new ArrayList<String>();
        for (int i = 0; i < N;i++) {
            String keihinn = sc.next();

            if (S.indexOf(keihinn) == -1) {
                S.add(keihinn);
            }
        }
        System.out.println(S.size());

    }
}
