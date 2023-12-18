import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String A = stdR.readLine();
        String B = stdR.readLine();
        String C = stdR.readLine();
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            if(A.charAt(i) == B.charAt(i)) {
                if(A.charAt(i) != C.charAt(i)) {
                    count += 1;
                }
            }else if(A.charAt(i) == C.charAt(i)) {
                count += 1;
            }else if(B.charAt(i) == C.charAt(i)) {
                count += 1;
            }else {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
