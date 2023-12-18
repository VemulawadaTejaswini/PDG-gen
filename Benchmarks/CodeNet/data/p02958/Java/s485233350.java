import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] p = new int[N];
        String[] s = stdR.readLine().split(" ");
        for(int i = 0 ; i < N ; i++) {
            p[i] = Integer.parseInt(s[i]);
        }
        if(isOrder(p)) {
            System.out.println("YES");
        }else {
            boolean isok = false;
            for(int i = 0 ; i < N ; i++) {
                for(int j = i + 1 ; j < N ; j++) {
                    int tmp = p[i];
                    p[i] = p[j];
                    p[j] = tmp;
                    isok = isOrder(p);
                    if(isok) {
                        System.out.println("YES");
                        break;
                    }else {
                        p[j] = p[i];
                        p[i] = tmp;
                    }
                }
                if(isok)break;
            }   
            if(!isok)System.out.println("NO");
        }
        
    }
    
    public static boolean isOrder(int[] a) {
        int res = a[0];
        for(int i = 1 ; i < a.length ; i++) {
            if(res <= a[i]) {
                res = a[i];
            }else {
                return false;
            }
        }
        return true;
    }
}
