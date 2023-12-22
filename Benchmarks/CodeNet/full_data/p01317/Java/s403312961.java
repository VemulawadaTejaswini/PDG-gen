
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    double EPS = 1e-9;
    int n, m;
    int[][] w1, w2;
    int r;
    int[] z;

    void run() {
        for(;;){
            n=sc.nextInt();
            m=sc.nextInt();
            if((n|m)==0){
                break;
            }
            w1=new int[n][n];
            w2=new int[n][n];
            for(int i=0;i<n;i++){
                fill(w1[i],INF);
                fill(w2[i],INF);
                w1[i][i]=w2[i][i]=0;
            }
            for(int i=0;i<m;i++){
                int x=sc.nextInt()-1;
                int y=sc.nextInt()-1;
                int t=sc.nextInt();
                String s=sc.next();
                if(s.equals("L")){
                    w1[x][y]=w1[y][x]=min(w1[x][y],t);
                }else{
                    w2[x][y]=w2[y][x]=min(w2[x][y],t);
                }
            }
            r=sc.nextInt();
            z=new int[r];
            for(int i=0;i<r;i++){
                z[i]=sc.nextInt()-1;
            }
            solve();
        }
    }
    
    void solve(){
        wf();
        int[][] d=new int[r][n]; // v ship
        for(int i=0;i<r;i++){
            fill(d[i],INF);
        }
        for(int i=0;i<n;i++){
            debug(w1[i]);
        }
        debug();
        for(int i=0;i<n;i++){
            debug(w2[i]);
        }
        d[0][z[0]]=0;

        for(int v=0;v<r-1;v++){
            for(int s=0;s<n;s++){
                d[v+1][s]=min(d[v+1][s],d[v][s]+w1[z[v]][z[v+1]]);
                for(int k=0;k<n;k++){
                    d[v+1][k]=min(d[v+1][k], d[v][s]+w1[z[v]][s]+w2[s][k]+w1[k][z[v+1]]);
                }
            }
        }
        
        int min=INF;
        for(int i=0;i<n;i++){
            min=min(min,d[r-1][i]);
        }
        for(int i=0;i<n;i++){
            debug(i,d[i]);
        }
        debug(min);
        println(""+min);
    }
    
    void wf(){
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    w1[j][i]=w1[i][j]=min(w1[j][i],w1[i][k]+w1[k][j]);
                    w2[j][i]=w2[i][j]=min(w2[j][i],w2[i][k]+w2[k][j]);
                }
            }
        }
    }
    
    void debug(Object... os) {
        // System.err.println(deepToString(os));
    }

    void print(String s) {
        System.out.print(s);
    }

    void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}