import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] s = stdR.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int A = Integer.parseInt(s[1]);
        int B = Integer.parseInt(s[2]);
        int num = 0;
        for(int i = 1 ; i <= N; i++) {
            String str = String.valueOf(i);
            int count = 0;
            for(int j = 0 ; j < str.length(); j++) {
                count += Character.digit(str.charAt(j), 10);
            }
            if(A <= count && count <= B) num+=i;
        }
        System.out.println(num);
    }
}
