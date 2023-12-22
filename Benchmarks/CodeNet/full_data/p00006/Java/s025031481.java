import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            StringBuffer sb = new StringBuffer(br.readLine());
            String line = sb.reverse().toString();
            System.out.println(line);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}