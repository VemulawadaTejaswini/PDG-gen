import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        long Q = Long.parseLong(sc.nextLine());
        boolean isLeadLeft = true;

        StringBuilder sb = new StringBuilder();
        sb.append(S);

        for (int i = 0; i < Q; i++) {
            String[] queries = sc.nextLine().split(" ");
            if (queries[0].equals("1")) {
                isLeadLeft = !isLeadLeft;
            } else {
                String f = queries[1];
                if (f.equals("1")) {
                    if (isLeadLeft) {
                        sb.insert(0, queries[2]);
                    } else {
                        sb.insert(sb.length() - 1, queries[2]);
                    }
                } else {
                    if (isLeadLeft) {
                        sb.insert(sb.length() - 1, queries[2]);
                    } else {
                        sb.insert(0, queries[2]);
                    }
                }
            }
        }

        sc.close();

        if (!isLeadLeft) {
            sb.reverse();
        }

        System.out.println(sb.toString());

    }
}
