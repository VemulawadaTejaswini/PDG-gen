import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            while (true) {
                String line = br.readLine();
                st = new StringTokenizer(line);
                int h = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                if(h==0&&w==0){
                    break;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < w; i++) {
                    sb.append("#");
                }

                for (int i = 0; i < h; i++) {
                    System.out.println(sb.toString());
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}