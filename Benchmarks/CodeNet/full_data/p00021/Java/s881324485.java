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
                float x1 = Float.parseFloat(st.nextToken());
                float y1 = Float.parseFloat(st.nextToken());
                float x2 = Float.parseFloat(st.nextToken());
                float y2 = Float.parseFloat(st.nextToken());
                float x3 = Float.parseFloat(st.nextToken());
                float y3 = Float.parseFloat(st.nextToken());
                float x4 = Float.parseFloat(st.nextToken());
                float y4 = Float.parseFloat(st.nextToken());
                float slope1 = (x2 - x1) / (y2 - y1);
                float slope2 = (x4 - x3) / (y4 - y3);
                float sloap3 = (x4 - x1) / (y4 - y1);
                if (slope1 == slope2 && slope1 != sloap3) {
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