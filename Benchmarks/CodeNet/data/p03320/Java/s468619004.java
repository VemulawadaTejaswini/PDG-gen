import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        ArrayList<Long> ans = new ArrayList<Long>();
        for (int i=1;i<=9;i++) {
            ans.add((long)i);
        }

        for (int i=1;i<15;i++) {
            for (int j=1;j<=9;j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                for (int k=0;k<i;k++) {
                    sb.append(9);
                }
                ans.add(Long.parseLong(sb.toString()));
            }
        }

        for (int i=0;i<K;i++) {
            System.out.println(ans.get(i));
        }
    }
}