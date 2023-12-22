import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        call(Integer.parseInt(line));

    }
    static void call(int n) {
        for(int i=1;i <= n;i++) {
            int x = i;
            if(x % 3 == 0){
                System.out.print(" " + i);
                continue;
            }
            if(x % 10 == 3){
                System.out.print(" " + i);
            }
            if((x /= 10) == 1)continue;
        }
    }
}