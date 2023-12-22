import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();
        while(x!=0 || y!=0){
            int sx = 0, sy = 0, gx = 0, gy = 0;
            
            int[] idx = new int[5];
            int[][][] xy = new int[5][1000][2];
            for(int i=0; i<5; i++){
                for(int j=0; j<1000; j++) xy[i][j][0] = -1;
            }
            
            for(int i=0; i<y; i++){
                String s = sc.next();
                for(int j=0; j<x; j++){
                    char c = s.charAt(j);
                    if(c=='S'){
                        sx = j; sy = i;
                    }else if(c=='G'){
                        gx = j; gy = i;
                    }else if(c!='.'){
                        int iidx = c-'1';
                        //xy[テ・ツアツ榲ヲツ?ァi][テ・ツアツ榲ヲツ?ァiテ」ツ?ョjテァツ閉ェテァツ崢ョ][xy] = テ・ツコツァテヲツィツ?
                        xy[iidx][idx[iidx]][0] = j;
                        xy[iidx][idx[iidx]][1] = i;
                        idx[iidx]++;
                    }
                } 
            }
            
            //cost[テ・ツアツ榲ヲツ?ァi][テ・ツアツ榲ヲツ?ァiテ」ツ?ョjテァツ閉ェテァツ崢ョテ」ツ?ョテ」ツδ妥」ツδ?」ツδ「テ」ツδウ][テ・ツアツ榲ヲツ?ァ(i+1)テ」ツ?ョkテァツ閉ェテァツ崢ョテ」ツ?ョテ」ツδ妥」ツδ?」ツδ「テ」ツδウ] = テァツァツサテ・ツ仰陛」ツつウテ」ツつケテ」ツδ?
            int[][][] cost = new int[5][1000][1000];
            for(int i=0; i<5; i++){
                for(int j=0; j<idx[i]; j++){
                    int iidx = (i+1) % 5;
                    for(int k=0; k<idx[iidx]; k++){
                        cost[i][j][k] = Math.abs(xy[i][j][0] - xy[iidx][k][0])
                            + Math.abs(xy[i][j][1] - xy[iidx][k][1]);
                    }
                }
            }
            
            int INF = Integer.MAX_VALUE/10;
            int minNum = 0;
            int min = INF;
            for(int start = 0; start<5; start++){
                //dp[テァツ渉セテ・ツ慊ィテ」ツ?ョテ・ツアツ榲ヲツ?ァ][テ」ツ?敕」ツ?ョテ・ツアツ榲ヲツ?ァテ」ツ?ョiテァツ閉ェテァツ崢ョテ」ツ?ョテ」ツδ妥」ツδ?」ツδ「テ」ツδウ] = テ」ツつウテ」ツつケテ」ツδ暗」ツ?ョテヲツ慊?・ツーツ湘・ツ?、
                int[][] dp = new int[5][1000];
                for(int i=0; i<5; i++) Arrays.fill(dp[i], INF);
                
                //テ」ツつケテ」ツつソテ」ツδシテ」ツδ暗、ツスツ催ァツスツョテ」ツ?凝」ツつ嘉・ツ按敕」ツつ?」ツ?ォテヲツ債陛」ツ?セテ」ツ?暗」ツつ凝」ツδ妥」ツδ?」ツδ「テ」ツδウテ」ツ?セテ」ツ?ァテ」ツ?ョティツキツ敕ゥツ崢「テ」ツつ津ィツカツウテ」ツ?凖」ツ??
                int iidx = (start+1) % 5;
                for(int i=0; i<idx[iidx]; i++){
                    dp[iidx][i] = Math.abs(sx - xy[iidx][i][0]) + Math.abs(sy - xy[iidx][i][1]);
                }
                iidx = (iidx + 1) % 5;
                while(iidx!=start){
                    for(int i=0; i<idx[iidx]; i++){
                        int before = (iidx+4) % 5;
                        for(int j=0; j<idx[before]; j++){
                            if(dp[before][j]==INF) continue;
                            dp[iidx][i] = Math.min(dp[iidx][i], dp[before][j] + cost[before][j][i]);
                        }
                    }
                    iidx = (iidx + 1) % 5;
                }

                //テヲツ慊?・ツセツ古」ツ?ォテヲツ債陛」ツ?セテ」ツ?暗」ツつ凝」ツδ妥」ツδ?」ツδ「テ」ツδウテ」ツ?凝」ツつ嘉」ツつエテ」ツδシテ」ツδォテ」ツ?セテ」ツ?ァテ」ツ?ョティツキツ敕ゥツ崢「テ」ツつ津ィツカツウテ」ツ?凖」ツ??
                iidx = (start+4) % 5;
                for(int i=0; i<idx[iidx]; i++){
                    if(dp[iidx][i]==INF) continue;
                    dp[iidx][i] += Math.abs(gx - xy[iidx][i][0]) + Math.abs(gy - xy[iidx][i][1]);
                    if(min>dp[iidx][i]){
                        minNum = start+1;
                        min = Math.min(min, dp[iidx][i]);
                    }
                }
            }
            if(min==INF) System.out.println("NA");
            else System.out.println(minNum+" "+min);            
            x = sc.nextInt(); y = sc.nextInt();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}