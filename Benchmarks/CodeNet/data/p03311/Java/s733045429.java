
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int b = 0;
        for(int i=0;i<n;i++){
        	a[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        	list.add(a[i]-(i+1));
        }
        Collections.sort(list);
        b = list.get(list.size()/2);
        long ans = 0;
        for(int i=0;i<n;i++){
        	ans += (long)Math.abs(a[i]-(b+i+1));
        }
        System.out.println(ans);
    }
}