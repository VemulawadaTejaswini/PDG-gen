import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        if(k < 7) {
            System.out.println("-1");
            return;
        }
        int v = 7 % k;
        for(int i=1; i<1e7; i++) {
            if(v == 0){
                System.out.println(i);
                return;
            }
            v = (v*10+7)%k;
        }
        System.out.println("-1");
    }
}