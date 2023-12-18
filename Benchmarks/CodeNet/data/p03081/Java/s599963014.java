import java.io.*;
import java.util.*;

public class Main {
    static int[] color;
    static int[][] order;
    static int n,Q;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        n = sc.nextInt(); Q = sc.nextInt();
        order = new int[Q][2];
        color = new int[n];
        char[] s = sc.next().toCharArray();
        for(int i=0;i<n;i++) color[i]=s[i]-'A';
        for(int i=0;i<Q;i++){
            int cur = sc.next().charAt(0)-'A';
            int dir = sc.next().charAt(0)=='L'?-1:1;
            order[i][0] = cur; order[i][1] = dir;
        }
        // find the idx left
        int left;
        if(!exitFromLeft(0)) left = 0;
        else{
            if(exitFromLeft(n-1)) left = n;
            else{
                int hi = n-1, lo = 0;
                while(hi-lo>1){
                    int mid = (hi+lo)/2;
                    if(exitFromLeft(mid)) lo=mid;
                    else hi = mid;
                }
                left = hi;
            }
        }
        int right;
        if(!exitFromRight(n-1)) right = n-1;
        else{
            if(exitFromRight(0)) right = -1;
            else{
                int hi = n-1, lo = 0;
                while(hi-lo>1){
                    int mid = (hi+lo)/2;
                    if(exitFromRight(mid)) hi=mid;
                    else lo = mid;
                }
                right = lo;
            }
        }
        System.out.println(Math.max(0,right-left+1));
    }
    static boolean exitFromLeft(int idx){
        int pos = idx;
        for(int i=0;i<Q;i++){
            if(order[i][0]!=color[pos]) continue;
            pos += order[i][1];
            if(pos==n) return false;
            if(pos<0) return true;
        }
        return false;
    }
    static boolean exitFromRight(int idx){
        int pos = idx;
        for(int i=0;i<Q;i++){
            if(order[i][0]!=color[pos]) continue;
            pos += order[i][1];
            if(pos==n) return true;
            if(pos<0) return false;
        }
        return false;
    }
}