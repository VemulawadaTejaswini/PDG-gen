import java.util.*;
import java.io.*;

class Main{
    static int[][] xy;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        xy=new int[n][2];
        for(int i=0;i<n;i++){
            xy[i][0]=sc.nextInt();
            xy[i][1]=sc.nextInt();
        }
        sc.close();
        double ave=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> toVisit=new HashSet<>();
            for(int j=0;j<n;j++) if(i!=j) toVisit.add(j);
            ave+=visit(i, toVisit);
        }
        ave/=n;
        System.out.println(ave);
    }
    public static double visit(int now, HashSet<Integer> toVisit){
        if(toVisit.size()==0) return (double) 0;
        double ret=0;
        HashSet<Integer> copy=(HashSet<Integer>) toVisit.clone();
        for(int v:copy){
            toVisit.remove(v);
            ret+=Math.sqrt((double) ((xy[now][0]-xy[v][0])*(xy[now][0]-xy[v][0])+(xy[now][1]-xy[v][1])*(xy[now][1]-xy[v][1])));
            ret+=visit(v, toVisit);
            toVisit.add(v);
        }
        ret/=copy.size();
        return ret;
    }
}
