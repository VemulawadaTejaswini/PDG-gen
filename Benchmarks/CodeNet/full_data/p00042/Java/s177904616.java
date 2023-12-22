import java.util.*;
public class Main {
	/**
	 * @param sc 	 @ÇÝæèÏ
	 * @param N		@ó¨Ì
	 * @param W		@C~ªÏ¦çêéd³
	 * @param value	@ó¨Ì¿l
	 * @param weight ó¨Ìd³
	 */
	static Scanner sc = new Scanner(System.in);
	static int N, W;
	static int[] value, weight;
	static int count = 1;
	static int[][]dp;
	
	public static void main(String[] args) {
		while(read()){		
			solve();
			System.out.println("Case "+ count +":");
			System.out.println(dp[N][W-1]);
			System.out.println(W-1);
			count++;
		}
	}
	
	/**
	 * @param line			ÇÝñ¾sðêIÉÛ¶·éÏ
	 * @param devide 		line©ç,ÅæØÁÄ¨óÌ¿lÆd³ðÛ·ézñ
	 */
	public static boolean read(){
		
		W = Integer.parseInt(sc.nextLine());
		if(W == 0)return false;
		
		N = Integer.parseInt(sc.nextLine());
		value = new int[N];
		weight = new int[N];
		String line;
		
		for(int i = 0; i < N; i++){
			line = sc.nextLine();
			String[] devide = line.split(",");
			value[i] = Integer.parseInt(devide[0]);
			weight[i] = Integer.parseInt(devide[1]);
		}
		
		return true;
	}
	/**
	 * Sample InputÅ±Ìæ¤Èîñª^¦çêÄ¢éB
	 * C~Ìå«³@50
	 * óÌ@		5
	 * i¨ 		0	1	 2	  3	   4	
	 * weight   10	20   30   45   4
	 * value	60  100  120  210  10
	 * 
	 * ûjEEEÅÉi¨0ÌÝðgÁÄÝÄA»Ìãi¨1ðg¤×«©ärµÄ
	 * 		@ßéB±ÌÆ«Ai¨ÌÝð0ðgÁ½Æ«Ìîñðp·éB
	 * 
	 * (1)i¨0ÌÝðgÁ½ê
	 * å«³			0  10  
	 * ¿lÌv	0  60  
	 * 
	 * (2)i¨0Æi¨1ðgÁ½ê
	 * å«³			0  10  20  30    
	 * ¿lÌv	0  60  100 160 
	 * 
	 * (3)i¨0Æi¨1Æi¨2ðgÁ½ê
	 * å«³			0  10  20  30  40  
	 * ¿lÌv	0  60  100 160 180
	 * 
	 * (4)i¨0Æi¨1Æi¨2Æi¨3ðgÁ½ê
	 * å«³			0  10  20  30  40  45  
	 * ¿lÌv	0  60  100 160 180 210
	 * 
	 * (5)i¨0Æi¨1Æi¨2Æi¨3Æi¨4ðgÁ½ê
	 * å«³			0  4  10  14  20  24  30  34  40  44  45  49  
	 * ¿lÌv	0  10 60  70  100 110 160 170 180 190 210 220 
	 * 
	 * @param total ibvTbNÌå«³
	 * 
	 * 	 */
	static void solve(){
		
		dp = new int[N+1][W+1];
		/**
		 * zñÌú»
		 */
		for(int i = 0; i <= W; i++){
			dp[0][i] = 0;
		}
		for(int i = 0; i <= N; i++){
			dp[i][0] = 0;
		}
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= W; j++){
				if(j < weight[i]){//üçÈ¢Æ«
					dp[i+1][j] = dp[i][j];
				}else{//üéÆ«
					dp[i+1][j] = Math.max(dp[i][j], dp[i][j - weight[i]] + value[i]);
				}
			}
		}
	}//solveÌIíè
}