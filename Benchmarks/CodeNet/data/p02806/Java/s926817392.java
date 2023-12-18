import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String[] S = new String[N];
        int[] t = new int[N];
        for(int i = 0 ; i < N ; i++) {
            String[] tmp = stdR.readLine().split(" ");
            S[i] = tmp[0];
            t[i] = Integer.parseInt(tmp[1]);
        }
        int sum = 0;
        boolean sleeped = false;
        String sleeps = stdR.readLine();
        for(int i = 0 ; i < N ; i++) {
            if(sleeped)sum += t[i];
            if(sleeps.equals(S[i]))sleeped = true;
        }
        System.out.println(sum);
    }
}