import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int K = Integer.parseInt(str[2]);
        int num = 1;
        int count = 0;
        while(true) {
            if(A % num == 0 && B % num == 0)count++;
            if(count == K) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
