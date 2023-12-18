import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int count = 0;
        long ans = 0;
        int i = 13;
        String w = "";
        
        if(K <= 12) {
            count = K;
            ans = K;
        }else {
            count = 12;
            ans = 12;
            while(count < K) {
                w = String.valueOf(i);
                String[] sp = w.split("");
                
                for(int j = 0; j < sp.length-1; j++) {
                    int a = Integer.parseInt(sp[j]);
                    int b = Integer.parseInt(sp[j+1]);
                    if(a - b > 1 || a - b < -1) {
                        i += 8;
                        break;
                    }
                    if(j == sp.length-2) {
                        count++;
                        ans = i;
                        i++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}