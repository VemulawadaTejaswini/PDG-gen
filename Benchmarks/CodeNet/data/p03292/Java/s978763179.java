import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
        a[2] = scan.nextInt();
        Arrays.sort(a);
        System.out.println(a[2] - a[0]);
        scan.close();
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}