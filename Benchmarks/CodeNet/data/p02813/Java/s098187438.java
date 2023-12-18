import java.util.*;


public class Main {
    static List<String> z;

    public static void permutation(String q, String ans) {
        if (q.length() <= 1) {
            z.add(ans + q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        z = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int[] Ps = new Ps[N];
//        int[] Qs = new Qs[N];
        StringBuilder P_sb = new StringBuilder();
        StringBuilder Q_sb = new StringBuilder();
        for (int n = 0; n < N; n++) {
            P_sb.append(Integer.toString(sc.nextInt()));
        }
        for (int n = 0; n < N; n++) {
            Q_sb.append(Integer.toString(sc.nextInt()));
        }

        StringBuilder sb = new StringBuilder();

        for (int n = 0; n < N; n++) {
            sb.append(Integer.toString(n + 1));
        }

//        System.out.println(sb.toString());

//        permutation("12345", "");
        permutation(sb.toString(), "");
//        System.out.println(z.size());
        int a = 0; int b = 0;
        for (int i = 0; i < z.size(); i++) {
//            System.out.println(z.get(i));
            if ( P_sb.toString().equals(z.get(i)) ) a = i;
            if ( Q_sb.toString().equals(z.get(i)) ) b = i;
        }
        System.out.println(Math.abs(b - a));
    }
}