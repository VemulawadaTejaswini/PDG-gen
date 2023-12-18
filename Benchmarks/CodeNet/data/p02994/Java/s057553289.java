
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int ans = 0;
        if(l>0){
        	ans = (2 * l + n) * (n - 1) / 2;
        }
        else if(l+n-1<0){
        	ans = (2 * l + n - 2) * (n - 1) / 2;
        }
        else{
        	ans = (2 * l + n - 1) * (n - 1) / 2;
        }
        System.out.println(ans);
    }
}