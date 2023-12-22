import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    static int D;
    static long[] c;
    static long[][] s;

    private static class Solution implements Comparable<Solution>{
        int[] contests;
        long score;
        private int last(int d, int i){
            for(int p=d; p>=0; p--){
                if(contests[p]==i) return p;
            }
            return -1;
        }
        private int next(int d, int i){
            for(int p=d; p<D; p++){
                if(contests[p]==i) return p;
            }
            return D;
        }

        private long calculateScore(){
            long sc = 0;
            for(int d=0; d<D; d++){
                sc += s[d][contests[d]];
                for(int i=0; i<26; i++){
                    sc -= c[i] * (d - last(d,i));
                }
            }
            return sc;
        }

        private long calculateScoreWithOutput(){
            long sc = 0;
            for(int d=0; d<D; d++){
                sc += s[d][contests[d]];
                for(int i=0; i<26; i++){
                    sc -= c[i] * (d - last(d,i));
                }
                System.out.println(sc);
            }
            return sc;
        }

        public Solution(int[] t){
            contests = new int[D];
            for(int d=0; d<D; d++) contests[d] = t[d];
            score = calculateScore();            
        }
        public int compareTo(Solution another){
            return Long.compare(this.score, another.score);
        }
        public long getScore(){
            return score;
        }
        public int[] getSchedule(){
            return contests;
        }

        public void change(int d, int newContest){
            int oldContest = contests[d];
            long score_diff = s[d][newContest] - s[d][oldContest];

            /*contest i held on a,b,c-th days -> a,c-thdays*/
            /*1+2+...+(c-a)  -> 1+2+..+(b-a) + 1+2+...(c-b)*/
            int lastOld = this.last(d-1, oldContest);
            int nextOld = this.next(d+1, oldContest);
            score_diff -= c[oldContest] * (nextOld-lastOld)*(nextOld-lastOld+1)/2;
            score_diff += c[oldContest] * (d-lastOld)*(d-lastOld+1)/2;
            score_diff += c[oldContest] * (nextOld-d)*(nextOld-d+1)/2;

            int lastNew = this.last(d-1, newContest);
            int nextNew = this.next(d+1, newContest);
            score_diff += c[newContest] * (nextNew-lastNew)*(nextNew-lastNew+1)/2;
            score_diff -= c[newContest] * (d-lastNew)*(d-lastNew+1)/2;
            score_diff -= c[newContest] * (nextNew-d)*(nextNew-d+1)/2;

            contests[d] = newContest;
            score += score_diff;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        c = new long[26];
        s = new long[D][26];

        for(int a=0;a<26; a++) c[a] = sc.nextLong();
        for(int d=0; d<D; d++) for(int a=0; a<26; a++) s[d][a] = sc.nextLong();

        int[] t = new int[D];
        for(int d=0; d<D; d++) t[d] = sc.nextInt()-1;

        Solution sample = new Solution(t);
        
        int M = sc.nextInt();
        for(int m=0; m<M; m++){
            int d = sc.nextInt()-1;
            int q = sc.nextInt()-1;
            sample.change(d,q);
            //System.out.println(sample.calculateScore());
            System.out.println(sample.getScore());
        }
    }
}
