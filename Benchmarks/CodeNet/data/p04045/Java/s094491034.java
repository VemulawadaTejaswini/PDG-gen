import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int[] num = new int[10];

        for (int i = 0;i < k; i++) {
            int a = s.nextInt();
            num[a]=1;
        }
        String si = String.valueOf(n);
        char[] sr = si.toCharArray();
        for (int i = 0;i < sr.length;i++) {
            for (int j = 0;j < 10;j++) {
                if ((sr[i] - '0') > (j)) continue;
                if (i == 0 && j != 0 &&  num[j] == 0) {
                    sr[i] = (char)(j + '0') ;
                    break;
                } else if (i > 0 && num[j] == 0) {
                    sr[i] = (char)(j + '0');
                    break;
                }
            }
        }

        System.out.println(new String(sr));
    }
}