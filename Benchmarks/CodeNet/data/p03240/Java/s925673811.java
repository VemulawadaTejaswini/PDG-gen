import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static int[] x,y,h;
    static int n;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];y = new int[n];h = new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                int res = check(i,j);
                if(res>0){
                    System.out.println(Integer.toString(i)+" "+Integer.toString(j)+" "+Integer.toString(res));
                    return;
                }
            }
        }
    }
    static int check(int cx, int cy){
        int hmax = Integer.MAX_VALUE;
        HashSet<Integer> rec = new HashSet<>();
        for(int i=0;i<n;i++){
            if(h[i]==0) hmax=Math.min(hmax,Math.abs(cx-x[i])+Math.abs(cy-y[i]));
            else rec.add(Math.abs(cx-x[i])+Math.abs(cy-y[i])+h[i]);
        }
        if(rec.size()!=1) return -1;
        for(int w:rec){
            return w<=hmax?w:-1;
        }
        return -1;
    }
}
