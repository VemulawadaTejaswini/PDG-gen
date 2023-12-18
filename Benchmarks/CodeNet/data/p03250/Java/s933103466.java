import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) a[i] = scan.nextInt();
        Arrays.sort(a);
        System.out.println(a[2] * 10 + a[1] + a[0]);
        scan.close();
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}