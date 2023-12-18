import java.io.*;

public class Battle {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            char[] n = in.readLine().toCharArray();
            int count = 0;
            for (int i = 0;i < n.length - 3;i ++) {
                for (int j = i + 3;j < n.length;j ++) {
                    int factor = 1;
                    int t = 0;
                    for (int k = j;k >= i;k --) {
                        t += factor * Integer.parseInt(n[k] + "");
                        factor *= 10;
                    }
                    if (t % 2019 == 0) {
                        count ++;
                    }
                }
            }
            System.out.print(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
