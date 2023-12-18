import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        long Q = Long.parseLong(sc.nextLine());
        boolean isLeadLeft = true;

        StringBuilder sb = new StringBuilder();
        StringBuilder sbLeft1 = new StringBuilder();
        StringBuilder sbLeft2 = new StringBuilder();
        StringBuilder sbRight1 = new StringBuilder();
        StringBuilder sbRight2 = new StringBuilder();
        sb.append(S);

        for (int i = 0; i < Q; i++) {
            String[] queries = sc.nextLine().split(" ");
            if (queries[0].equals("1")) {
                isLeadLeft = !isLeadLeft;
            } else {
                String f = queries[1];
                if (f.equals("1")) {
                    if (isLeadLeft) {
                        if (sbLeft1.length() <= 10000) {
                            sbLeft1.append(queries[2]);
                        } else {
                            sbLeft2.append(queries[2]);
                        }
                    } else {
                        if (sbRight1.length() <= 10000) {
                            sbRight1.append(queries[2]);
                        } else {
                            sbRight2.append(queries[2]);
                        }
                    }
                } else {
                    if (isLeadLeft) {
                        if (sbRight1.length() <= 10000) {
                            sbRight1.append(queries[2]);
                        } else {
                            sbRight2.append(queries[2]);
                        }
                    } else {
                        if (sbLeft1.length() <= 10000) {
                            sbLeft1.append(queries[2]);
                        } else {
                            sbLeft2.append(queries[2]);
                        }
                    }
                }
            }
        }

        sc.close();

        sbLeft1.reverse();
        sbLeft2.reverse();

        sbLeft1.append(sbLeft2.toString()).append(sb.toString()).append(sbRight1.toString())
                .append(sbRight2.toString());

        if (!isLeadLeft) {
            sbLeft1.reverse();
        }

        System.out.println(sbLeft1.toString());

    }
}
