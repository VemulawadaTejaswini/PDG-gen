import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int W = Integer.parseInt(str[1]);
        String[] s = new String[H];
        int[] x = {-1,0,0,1};
        int[] y = {0,-1,1,0};
        for(int i = 0 ; i < H ; i++) {
            s[i] = stdR.readLine();
        }
        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < W ; j++) {
                if(s[i].charAt(j) == '#') {
                    boolean isok = false;
                    for(int k = 0 ; k < x.length ; k++) {
                        if(j + x[k] >= 0 && j + x[k] < s[0].length() && i + y[k] >= 0 && i + y[k] < s.length && s[i + y[k]].charAt(j + x[k]) == '#') {
                            isok = true;
                            break;
                        }
                    }
                    if(!isok) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }

}
