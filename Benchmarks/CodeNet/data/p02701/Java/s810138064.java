import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String[] S = new String[N];
        List<String> types = new ArrayList<String>();
        S[0] = input.next();
        types.add(S[0]);

        for (int i = 1; i < N; i++) {
            S[i] = input.next();
            for (int j = 0; j < types.size(); j++) {
                if (S[i].equals(types.get(j))) {
                    break;
                } else if (j == (i - 1)) {
                    types.add(S[i]);
                } else {
                    continue;
                }
            }
        }

        System.out.println(types.size());
    }
}
