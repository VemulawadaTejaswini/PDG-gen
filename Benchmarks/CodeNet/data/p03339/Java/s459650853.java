import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] s = S.split("");
        int[] e = new int[N];
        int[] w = new int[N];
        int esum = 0;
        int wsum = 0;
        
        if(s[0].equals("W")) {
            w[0] = 1;
            wsum++;
        }else {
            e[0] = 1;
            esum++;
        }
        
        for(int i=1; i<N; i++) {
            if(s[i].equals("W")) {
                w[i] = w[i-1]+1;
                e[i] = e[i-1];
                wsum++;
            }else {
                e[i] = e[i-1]+1;
                w[i] = w[i-1];
                esum++;
            }
        }
        
        int[] count = new int[N];
        count[0] = esum-e[0];
        for(int i=1; i<N; i++) {
            count[i] = w[i-1] + (esum - e[i]);
        }
        Arrays.sort(count);
        System.out.println(count[0]);
    }
}
