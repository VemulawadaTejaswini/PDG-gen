import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            int w = Integer.parseInt(line);
            ArrayList<Integer> vline = new ArrayList<>();
            for(int i=1 ; i<=w ;i++){
                vline.add(i);
            }
            line = br.readLine();
            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                StringTokenizer st = new StringTokenizer(line, ",");
                int vNum1 = Integer.parseInt(st.nextToken());
                int vNum2 = Integer.parseInt(st.nextToken());
                int originalNum1 = vline.get(vNum1 -1);
                int originalNum2 = vline.get(vNum2 -1);
                vline.set(vNum1 -1,originalNum2);
                vline.set(vNum2 - 1,originalNum1);
            }
            for(int i:vline){
                System.out.println(i);
            }
        } catch (Exception e) {
            System.err.println();
        }
    }
}