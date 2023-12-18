import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int maxn=2;
    static long[] f5ac, inv;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int n = sc.nextInt();
        cell[] rec = new cell[n];
        for(int i=0;i<n;i++){
            String s = sc.next();
            int p = sc.nextInt();
            rec[i] = new cell(s,i+1,p);
        }
        Arrays.sort(rec);
        for(int i=0;i<n;i++) System.out.println(rec[i].idx);
    }
    static class cell implements Comparable<cell>{
        String city;
        int idx, score;
        public cell(String s, int i, int sc){
            city = s;
            idx = i; score = sc;
        }
        public int compareTo(cell c){
            if(!this.city.equals(c.city)) return this.city.compareTo(c.city);
            return -this.score+c.score;
        }
    }
}

