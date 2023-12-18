import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String[] str = stdR.readLine().split(" ");
        String[] str2 = stdR.readLine().split(" ");
        int res = 0;
        for(int i = 0 ; i < N ; i++) {
            int V = Integer.parseInt(str[i]);
            int C = Integer.parseInt(str2[i]);
            if(V > C) {
                res += V - C;
            }
        }
        System.out.println(res);
    }
}
