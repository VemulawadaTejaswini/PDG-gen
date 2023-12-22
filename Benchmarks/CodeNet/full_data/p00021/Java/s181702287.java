import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                double x1 = Double.parseDouble(st.nextToken());
                double y1 = Double.parseDouble(st.nextToken());
                double x2 = Double.parseDouble(st.nextToken());
                double y2 = Double.parseDouble(st.nextToken());
                double x3 = Double.parseDouble(st.nextToken());
                double y3 = Double.parseDouble(st.nextToken());
                double x4 = Double.parseDouble(st.nextToken());
                double y4 = Double.parseDouble(st.nextToken());
                double a1 = y2 - y1;
                double b1 = x1 - x2;
                double a2 = y4 - y3;
                double b2 = x3 - x4;
                if (a1 * b2 - a2 * b1 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}