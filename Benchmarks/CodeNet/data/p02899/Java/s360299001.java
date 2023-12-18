import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt();
        int[] out = new int[n];
        for(int i = 0; i < n; i++){
            out[a[i] - 1] = i + 1;
        }
        for(int i = 0; i < n; i++) System.out.print(out[i] + " ");
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
