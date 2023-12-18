import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), Q = sc.nextInt();
        int[] pos = new int[n+1];
        for(int i=0;i<=n;i++) pos[i]=i;
        boolean[] vis = new boolean[n+1]; // records the cup number
        vis[1]=true;vis[2]=true;
        int cur = 1; // current position of cup #1
        for(int i=0;i<Q;i++){
            int a =sc.nextInt(), b = sc.nextInt();
            if(a==cur) cur = b;
            else if(b==cur) cur = a;
            swap(pos,a,b);
            if(cur<n) vis[pos[cur+1]] = true;
            if(cur>1) vis[pos[cur-1]] = true;

        }
        int ans = 0;
        for(int i=1;i<=n;i++) ans += vis[i]?1:0;
        System.out.println(ans);
    }
    static void swap(int[] pos, int i, int j){
        int c = pos[i];
        pos[i] = pos[j];
        pos[j] = c;
    }
}
