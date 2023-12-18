import java.util.*;

public class Main {
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] d = new Integer[n];
        for(int i = 0; i < n; i++) d[i] = scan.nextInt();
        Arrays.sort(d, Comparator.reverseOrder());
        int out = 1;
        for(int i = 0; i < n - 1; i++){
            if(d[i] > d[i + 1]){
                out++;
            }
        }
        System.out.println(out);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
