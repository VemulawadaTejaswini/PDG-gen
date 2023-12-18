import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] out = new int[n];
        Arrays.fill(out, k);
        for(int i = 0; i < q; i++){
            out[scan.nextInt() - 1]++;
        }
        for(var i : out){
            if(i - q > 0) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
