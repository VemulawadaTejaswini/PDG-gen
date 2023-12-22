import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int s = Integer.parseInt(br.readLine());
        System.out.println(s/3600+":"+s/60%60+":"+s%60);
    }
}