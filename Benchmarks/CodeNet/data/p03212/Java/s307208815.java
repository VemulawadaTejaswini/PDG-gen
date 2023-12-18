import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; 357 <= i; i--) {
            if (i % 2 == 0)
                continue;

            String tmp = String.valueOf(i);
            boolean flag = true;
            int[] dic = new int[10];
            for (int s = 0; s < tmp.length(); s++) {
                int index = Integer.valueOf(tmp.substring(s, s+1));
                dic[index]++;
            }
            if (0 < dic[3] && 0 < dic[5] && 0 < dic[7] && dic[3] + dic[5] + dic[7] == tmp.length()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
