import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        String s = scan.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for(int i = 0; i < q; i++){
            l[i] = scan.nextInt();
            r[i] = scan.nextInt();
        }
        int[] out = new int[n];
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == 'C' && s.charAt(i - 1) == 'A'){
                Arrays.fill(out, i, n, out[i - 1] + 1);
            }
        }
        for(int i = 0; i < q; i++){
            System.out.println(out[r[i] - 1] - out[l[i] - 1]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
