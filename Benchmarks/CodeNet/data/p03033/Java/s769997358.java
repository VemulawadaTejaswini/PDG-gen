import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

class Stop implements Comparable<Stop>{
    int s; int t; int x; int start;
    public Stop(int s, int t, int x){
        this.s = s;
        this.t = t;
        this.x = x;
        this.start = this.s + this.x;
    }
    @Override
    public int compareTo(Stop m){
        return this.start - m.start;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        ArrayList<Stop> m = new ArrayList<Stop>();
        for(int i=0;i<n;i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            m.add(new Stop(s,t,x));
        }
        Collections.sort(m);
        for(int i=0;i<q;i++){
            int cur = m.get(0).x;
            int d = Integer.parseInt(sc.next());
            for(int j=0;j<n;j++){
                if(m.get(j).s <= d+cur && d+cur < m.get(j).t){
                    System.out.println(cur);
                  	break;
                }else{
                    if(j==n-1){
                        System.out.println(-1);
                      	break;
                    }else{
                        cur = Math.max(cur, m.get(j+1).x);
                    }
                }
            }
        }
        sc.close();
    }
}