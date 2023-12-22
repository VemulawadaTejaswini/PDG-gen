import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws IOException{
		Main m = new Main();
		m.main();
	}
	
	private void main(){
		Scanner in = new Scanner(System.in);
		
		while(true){
	        int x = in.nextInt();
	        int y = in.nextInt();		
	        int z = in.nextInt();
	        if((x == 0) && (y == 0) && (z == 0)){ break; }
	        
	        //System.out.println(x +","+ y +","+ z);
	        
	        // テ」ツδォテ」ツδシテ」ツδャテ」ツδε」ツδ暗」ツ?ョテヲツδ?・ツ?アテ」ツつ津・ツ?・テ・ツ環?
			int[] v = new int[x];
	        for(int i = 0; i < x; i++){	v[i] = in.nextInt(); }
	        
	        // テ・ツ?エテゥツ敖「テ」ツ?ョテヲツδ?・ツ?アテ」ツつ津・ツ?・テ・ツ環?
	        Map[] map = new Map[y + 1];
	        for(int i = 0; i <= y; i++){ map[i] = new Map(); } 
	        for(int i = 0; i < z; i++){
	        	map[in.nextInt()].set(in.nextInt(), in.nextInt());
	        }
	        
	        // dpテ」ツδ?」ツδシテ」ツδ姪」ツδォテ」ツ?ョテ、ツスツ愿ヲツ按?
	        int[][] dp = new int[y + 1][y + 1];
	        for(int i = 0; i <= y; i++){
	        	for(int j = 0; j <= y; j++){
	        		dp[i][j] = -999;
	        	}
	        }
	        
	        // dpテ」ツδ?」ツδシテ」ツδ姪」ツδォテ」ツ?ョテヲツ崢エテヲツ鳴ー
	        dp[0][0] = 0;
	        // iテ・ツ崢榲ァツ崢ョテ」ツ?ォjテ」ツδ榲」ツつケテ」ツ?ォテ」ツ??」ツつ凝」ツ?ィテ」ツ?催」ツ?ョテヲツ可?ヲツ個?ゥツ?妥」ツ?慧p[i][j]
	        // ティツ、ツ?ヲツ閉ーテ」ツδォテ」ツδシテ」ツδ暗」ツ?ァテ」ツ?敕」ツ?ョテ」ツδ榲」ツつケテ」ツ?ォティツセツソテ」ツつ甘」ツ?、テ」ツ?妥」ツつ凝・ツ?エテ・ツ青暗」ツ?ッテ・ツ青暗ィツィツ暗・ツ?、テ」ツ?古・ツ?・テ」ツつ?
	        for(int i = 0; i < y; i++){
	        	for(int j = 0; j < y; j++){
	        		if(dp[i][j] >= 0){
	        			for(int k = 0; k < x; k++){
	        				int next_j = (j + v[k]) < y ? (j + v[k]) : y;
	        				if(map[next_j].E == 1){
	        					next_j = (next_j + map[next_j].A < y) ? (next_j + map[next_j].A) : y;
	        					if(dp[i + 1][next_j] < 0){ dp[i + 1][next_j] = 0; }
        						dp[i + 1][next_j] += dp[i][j];
	        				}else{
	        					if(dp[i + 1][next_j] < 0){ dp[i + 1][next_j] = 0; }
	        					dp[i + 1][next_j] += dp[i][j];
	        					if(map[next_j].E == 2){ dp[i + 1][next_j] += map[next_j].A; }
	        					else if(map[next_j].E == 3){
	        						if(dp[i][j] < map[next_j].A){ dp[i + 1][next_j] -= dp[i][j]; }
	        						else{ dp[i + 1][next_j] -= map[next_j].A; }
        						}
	        				}
	        			}
	        		}
	        	}
	        }
	        
	        // テヲツ慊?・ツセツ古」ツ?ォテヲツ慊淌・ツセツ?・ツ?、テ」ツつ津・ツ?コテ」ツ??
	        double ave = 0;
	        int mother = x; 
	        for(int i = 1; i <= y; i++){
	        	if(dp[i][y] >= 0){
	        		ave += (double)dp[i][y] / mother;
	        	}
	        	mother *= x;
	        }
	        
	        System.out.println((int)ave);
	        
		}
        
		
		in.close();
		return;
	}
	
	class Map{
		public int E, A;
		Map(){ E = A = 0; }
		void set(int e, int a){
			E = e;
			A = a;
		}
		
		public String toString(){
			return "[" + E + "," + A + "]"; 
		}
	}
}