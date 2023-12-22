import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int M = sc.nextInt(); //試合時間
            int T = sc.nextInt(); //チーム数
            int P = sc.nextInt(); //問題数
            int R = sc.nextInt(); //提出記録の数
            if(M==0)break;
            
            int[][] teamdata = new int[1+T][3+P];
            //teamdata[0]は欠番
            //↓チーム番号
            //→正解数→所要時間合計→各問題の最終的な正誤（正解1誤答0）（P個）→チーム番号
            
            for(int i=0;i<1+T;i++){
                for(int j=0;j<3+P;j++){
                    teamdata[i][j]=0;
                }
            }
            
            for(int i=1; i<T+1;i++)
                teamdata[i][2+P]=i;
            
            
            int[][] teidata = new int[R][4];
            //→経過時間→チーム番号→問題番号→正誤（正解0誤答0以外（←注意！上と逆））
            
            for(int i=0;i<R;i++){
                for(int j=0;j<4;j++){
                    teidata[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0;i<R;i++){
                if(teidata[i][3]==0){
                    teamdata[teidata[i][1]][1+teidata[i][2]]=1; //正解した問題にチェックを入れる
                    teamdata[teidata[i][1]][1] += teidata[i][0]; //正答時の経過時間を加算
                    teamdata[teidata[i][1]][0]++; //正解数を増やした
                }
            }
            
            for(int i=0;i<R;i++){
                if(teamdata[teidata[i][1]][1+teidata[i][2]]==1&&teidata[i][3]!=0){                    
                     teamdata[teidata[i][1]][1]+=20;     //正解する前にした誤答のペナルティを加算
                }   
            }
            
            /*
             正解数、合計所要時間、チーム番号だけソートする
             */
            
            int[] temp = new int[3];
            for(int i=2;i<1+T;i++){
                for(int j=i-1;j>0;j--){
                    if(teamdata[j][0]<teamdata[j+1][0]){    //正解数でソート
                        
                        temp[0] = teamdata[j][0];
                        temp[1] = teamdata[j][1];
                        temp[2] = teamdata[j][2+P];
                        teamdata[j][0] = teamdata[j+1][0];
                        teamdata[j][1] = teamdata[j+1][1];
                        teamdata[j][2+P] = teamdata[j+1][2+P];
                        teamdata[j+1][0] = temp[0];
                        teamdata[j+1][1] = temp[1];
                        teamdata[j+1][2+P] = temp[2];
                                
                    }else if(teamdata[j][0]==teamdata[j+1][0]){     //合計所要時間でソート
                        if(teamdata[j][1]>teamdata[j+1][1]){
                            
                            temp[0] = teamdata[j][0];
                            temp[1] = teamdata[j][1];
                            temp[2] = teamdata[j][2+P];
                            teamdata[j][0] = teamdata[j+1][0];
                            teamdata[j][1] = teamdata[j+1][1];
                            teamdata[j][2+P] = teamdata[j+1][2+P];
                            teamdata[j+1][0] = temp[0];
                            teamdata[j+1][1] = temp[1];
                            teamdata[j+1][2+P] = temp[2];
                        }else if(teamdata[j][1]==teamdata[j+1][1]){ //チーム番号でソート
                            if(teamdata[j][2+P]<teamdata[j+1][2+P]){
                                temp[0] = teamdata[j][0];
                                temp[1] = teamdata[j][1];
                                temp[2] = teamdata[j][2+P];
                                teamdata[j][0] = teamdata[j+1][0];
                                teamdata[j][1] = teamdata[j+1][1];
                                teamdata[j][2+P] = teamdata[j+1][2+P];
                                teamdata[j+1][0] = temp[0];
                                teamdata[j+1][1] = temp[1];
                                teamdata[j+1][2+P] = temp[2];
                            
                            }
                        }else{
                        break;
                     } 
                  }
                }
            }
            
            
            System.out.print(teamdata[1][P+2]);
            for(int i=2;i<=T;i++){
                if(teamdata[i-1][0]==teamdata[i][0]&&teamdata[i-1][1]==teamdata[i][1]){
                    System.out.print("="+teamdata[i][P+2]);
                }else{
                    System.out.print(","+teamdata[i][P+2]);
                }
            }
            System.out.println();
            
            
        }        
    }   
}