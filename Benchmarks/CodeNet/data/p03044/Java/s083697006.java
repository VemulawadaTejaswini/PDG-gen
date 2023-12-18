import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] u = new int[N - 1];
        int[] v = new int[N - 1];
        int[] w = new int[N - 1];
        int[] painted = new int[N];//0 undef 1 white 2 black
        for(int i = 0 ; i < N - 1 ; i++) {
            String[] str = stdR.readLine().split(" ");
            u[i] = Integer.parseInt(str[0]) - 1;
            v[i] = Integer.parseInt(str[1]) - 1;
            w[i] = Integer.parseInt(str[2]);
            if(w[i] % 2 != 0) {
                if(painted[u[i]] != 0) {
                    if(painted[u[i]] == 1) {
                        painted[v[i]] = 2;
                    }else {
                        painted[v[i]] = 1;
                    }
                }else if(painted[v[i]] != 0) {
                    if(painted[v[i]] == 1) {
                        painted[u[i]] = 2;
                    }else {
                        painted[u[i]] = 1;
                    }
                }else {
                    painted[u[i]] = 1;
                    painted[v[i]] = 2;
                }
            }
        }
        
        for(int i = 0 ; i < N - 1 ; i++) {
            if(w[i] % 2 == 0) {
                if(painted[u[i]] != 0) {
                    if(painted[u[i]] == 1) {
                        painted[v[i]] = 1;
                    }else {
                        painted[v[i]] = 2;
                    }
                }else if(painted[v[i]] != 0) {
                    if(painted[v[i]] == 1) {
                        painted[u[i]] = 1;
                    }else {
                        painted[u[i]] = 2;
                    }
                }else {
                    painted[u[i]] = 1;
                    painted[v[i]] = 1;
                }
            }
        }
        
        for(int i = 0 ; i < N ; i++) {
            System.out.println(painted[i] - 1);
        }
    }
}
