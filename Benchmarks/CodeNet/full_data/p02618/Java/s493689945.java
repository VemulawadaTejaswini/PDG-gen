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

        private static int consecutiveSum(int i, int j){
            return (i+j) * (j-i+1) / 2;
        }

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
        public Solution(int[] t, long score){
            contests = new int[D];
            for(int d=0; d<D; d++) contests[d] = t[d];
            this.score = score;
        }
        public Solution(Solution s){
            this(Arrays.copyOf(s.contests, D), s.score);
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
        public void printSchedule(){
            for(int d=0; d<D; d++) System.out.println(contests[d]+1);
        }
        public long checkChangeScore(int d, int newContest){
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

            return score+score_diff;
        }
        public void change(int d, int newContest){
            long newScore = checkChangeScore(d, newContest);
            score = newScore;
            contests[d] = newContest;
        }
        public boolean changeAnneal(int d, int newContest, double temperature){
            long newScore = checkChangeScore(d, newContest);
            if(Math.exp((newScore-score)/temperature) > Math.random()){
                score = newScore;
                contests[d] = newContest;
                return true;
            } else return false;
        }


        public long checkSwapScore(int d1, int d2){
            if(contests[d1] == contests[d2]) return score;
            
            int c1 = contests[d1], c2 = contests[d2];
            
            this.change(d1, c2); this.change(d2, c1);
            long newScore = this.score;
            this.change(d1, c1); this.change(d2, c2);
            return newScore;
        }

        public void swap(int d1, int d2){
            long newScore = checkSwapScore(d1, d2);
            int x = contests[d1];
            contests[d1] = contests[d2];
            contests[d2] = x;
            score = newScore;            
        }
        public boolean swapAnneal(int d1, int d2, double temperature){
            long newScore = checkSwapScore(d1, d2);
            if(Math.exp((newScore-score)/temperature) > Math.random()){
                int x = contests[d1];
                contests[d1] = contests[d2];
                contests[d2] = x;
                score = newScore;
                return true;
            } else return false;
        }

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        D = sc.nextInt();
        c = new long[26];
        s = new long[D][26];

        for(int a=0;a<26; a++) c[a] = sc.nextLong();
        for(int d=0; d<D; d++) for(int a=0; a<26; a++) s[d][a] = sc.nextLong();

        int[] t = new int[D];
        for(int d=0; d<D; d++) t[d] = r.nextInt(26);
        Solution ans = new Solution(t);
        
        
        while(true){
            
            long time = System.currentTimeMillis() - startTime;
            if (time > 1850) break;
            
            if(Math.random()*2000 > time){
                int d = r.nextInt(D);
                int q = r.nextInt(26);
                ans.changeAnneal(d,q, time);
            }else{
                int d1 = r.nextInt(D);
                int d2 = r.nextInt(D);
                ans.swapAnneal(d1, d2, time);
            }
        }
        
        ans.printSchedule();
        System.err.println(ans.getScore());
    }
}
