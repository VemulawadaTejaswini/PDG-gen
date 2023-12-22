import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int d = Integer.parseInt(sc.next());
        
        int[] c = new int[26];
        for(int i=0; i<26; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        
        int[][] s = new int[d][26];
        for(int i=0; i<d; i++){
            for(int j=0; j<26; j++){
                s[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        int[] t = new int[d];
        /*
        for(int i=0; i<d; i++){
            t[i] = Integer.parseInt(sc.next());
        }
        */
        
        int[][] nocontest = new int[d+1][26];
        
        int score = 0;
        int[] scorememo = new int[d+1];
        
        for(int day=1; day<=d; day++){
            int max = (int)-1e8;
            int maxcontest = -1;
            for(int i=0; i<26; i++){
                int tmp = score + s[day-1][i];
                for(int j=0; j<26; j++){
                    if(j==i){
                        nocontest[day][j] = 0;
                    }else{
                        nocontest[day][j] = nocontest[day-1][j]+1;
                    }
                }
                if(max < tmp){
                    max = tmp;
                    maxcontest = i;
                }
            }
            
            for(int j=0; j<26; j++){
                if(j==maxcontest){
                    nocontest[day][j] = 0;
                }else{
                    nocontest[day][j] = nocontest[day-1][j]+1;
                }
            }
            score = max;
            scorememo[day] = score;
            t[day-1] = maxcontest;
        }
        
        for(int i=0; i<d; i++){
            //System.out.println(t[i]);
        }
        
        /*
        int m = Integer.parseInt(sc.next());
        int[][] q = new int[m][2];
        for(int i=0; i<m; i++){
            for(int j=0; j<2; j++){
                q[i][j] = Integer.parseInt(sc.next());
            }
        }
        */
        
        long[] nocon_priority = new long[26];
        for(int i=0; i<26; i++){
            nocon_priority[i] = (long)c[i]<<32;
            nocon_priority[i] += i;
        }
        Arrays.sort(nocon_priority);
        
        //優先するべきもの10個 * 10日だけ
        for(int idx=0; idx<10; idx++){
            int qidx = (int)nocon_priority[idx];
            //System.out.println(qidx);
            
            int[] scorememo_orig = new int[d+1];
            int[][] nocontest_orig = new int[d+1][26];
            for(int k=1; k<=d; k++){
                scorememo_orig[k] = scorememo[k];
                for(int l=0; l<26; l++){
                    nocontest_orig[k][l] = nocontest[k][l];
                }
            }
            int prevscore = score;
            
            for(int qday=1; qday<=Math.min(10, d-1); qday++){
                t[qday-1] = qidx+1;
                score = scorememo[qday-1];
                for(int day = qday; day<=d; day++){
                    int contest = t[day-1]-1;
                    //System.out.println(contest);
                    score += s[day-1][contest];
                    for(int j=0; j<26; j++){
                        if(j==contest){
                            nocontest[day][j] = 0;
                        }else{
                            nocontest[day][j] = nocontest[day-1][j]+1;
                        }
                    }
                    for(int j=0; j<26; j++){
                        score -= c[j] * nocontest[day][j];
                    }
                    scorememo[day] = score;
                }
                //System.out.println(score);
            }
            
            if(prevscore > score){
                //戻す
                scorememo = scorememo_orig;
                nocontest = nocontest_orig;
            }
        }
        System.out.println(scorememo[scorememo.length-1]);
        
    }
    
}
