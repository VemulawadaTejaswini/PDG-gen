import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] l = new int[n];
        for(int i = 0; i < n; i++) l[i] = scan.nextInt();
        Arrays.sort(l);
        int out = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if(l[k] < l[i] + l[j]) out++;
                    else break;
                }
            }
        }
        System.out.println(out);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
