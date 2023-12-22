import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < n; i++) {
            String[] lines=br.readLine().split(" ");
            int result=lines[0].compareToIgnoreCase(lines[1]);
            sum1+=result==0?1:result>0?3:0;
            sum2+=result==0?1:result<0?3:0;
        }
        System.out.println(sum1+" "+sum2);
    }
}