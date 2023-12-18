import java.io.*;

public class Battle {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            char[] n = in.readLine().toCharArray();
            int count = 0;
            for (int i = n.length - 1;i >= 3;i --) {
                for (int j = i - 3;j >= 0 && j >= i - 6;j --) {
                    String s = new String(n, j, i - j + 1);
                    int t = Integer.parseInt(s);
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
