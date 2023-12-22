import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] data;
            String res;
            int m, f, r;

            while (true) {
                data = br.readLine().split(" ");
                m = Integer.parseInt(data[0]);
                f = Integer.parseInt(data[1]);
                r = Integer.parseInt(data[2]);

                if (m == -1 && f == -1 && r == -1)
                    return;
                if (m == -1 || f == -1)
                    res = "F";
                else if (m + f >= 80)
                    res = "A";
                else if (65 <= m + f && m + f < 80)
                    res = "B";
                else if (50 <= m + f && m + f < 65)
                    res = "C";
                else if (30 <= m + f && m + f < 50) {
                    res = "D";
                    if (r >= 50)
                        res = "C";
                } else if (m + f < 30)
                    res = "F";
                else
                    return;

                System.out.println(res);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
