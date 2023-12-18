import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n], y = new long[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        long rmin = x[0], rmax = x[0], bmin = y[0], bmax = y[0];
        for(int i=1;i<n;i++){
            long ans1 = (Math.max(rmax,x[i])-Math.min(rmin,x[i]))*(Math.max(bmax,y[i])-Math.min(bmin,y[i]));
            long ans2 = (Math.max(rmax,y[i])-Math.min(rmin,y[i]))*(Math.max(bmax,x[i])-Math.min(bmin,x[i]));
            if(ans1<=ans2){
                rmax = Math.max(rmax,x[i]);rmin = Math.min(rmin,x[i]);
                bmax = Math.max(bmax,y[i]); bmin = Math.min(bmin,y[i]);
            } else{
                rmax = Math.max(rmax,y[i]); rmin = Math.min(rmin,y[i]);
                bmax = Math.max(bmax,x[i]); bmin = Math.min(bmin,x[i]);
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println((bmax-bmin)*(rmax-rmin));
        out.flush();
    }
}
