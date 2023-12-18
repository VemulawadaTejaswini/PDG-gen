import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i =0; i<n;i++){
            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            cnt += r - l + 1;
        }
        System.out.println(cnt);
    }
}
