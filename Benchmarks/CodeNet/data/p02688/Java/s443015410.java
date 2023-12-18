import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String str = reader.readLine();
            String[] numS = str.split(" ");
            int n = Integer.parseInt(numS[0]);
            int k = Integer.parseInt(numS[1]);

            boolean[] flag = new boolean[n];
            Arrays.fill(flag, false);

            for (int i = 0; i < k; i++) {
                Scanner s = new Scanner(System.in);
                int d = Integer.parseInt(s.next());
                for (int j = 0; j < d; j++) {
                    int dn = Integer.parseInt(s.next());
                    flag[dn-1] = true;
                }
            }

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (!flag[i]) count++;
            }

            System.out.println(count);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 