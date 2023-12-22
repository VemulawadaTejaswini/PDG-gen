import java.util.*;
public class Main {
	static int n, r, p, c;
	static Scanner sc = new Scanner(System.in);
	static int[] Hanafuda, temp;
	
	public static void main(String[] args) {
		while(read()){
			
		}
	}
	static boolean read(){
		/**
		 * ScannerNXÌnextInt()Å®lÌÇÝÝªÅ«Ü·B
		 */
		n = sc.nextInt(); r = sc.nextInt();
		/**
		 * âè¶æèAnÆrªÆàÉ0ÈçfalseðÔµÜ·B@
		 */
		if(n == 0 && r == 0)
			return false;
		/**
		 * ÔDÌzñAHanafudaÆAêIÉDððï³¹ézñ
		 * tempðõµÜ·B¡ñA0 < n <= 50 ÈÌÅ50ÜÅõ·éÆ
		 * âèÍð¯Ü·ªAHanafuda[0]ðg¢½­È¢ÌÅ51ÜÅpÓµÜ·B
		 */
		Hanafuda = new int[51];
		temp = new int[51];
		/**
		 * HanafudazñÌú»B
		 * Hanafuda[n]ÉÍ1AHanafuda[1]ÉÍnðüêÜ·B
		 */
		for(int i = 1; i <= n; i++){
			Hanafuda[i] = n - i + 1;
			temp[i] = 0;
		}
		/**
		 * rñApÆcª±­ÌÅnextInt()ÅÇÝÝÜ·B
		 * pÆcðêñÇÝÞ½ÑÉAVbt·éÌÅA
		 * »Ì½ÑÉsolve()ÖðÄÑÜ·B
		 */
		for(int i = 0; i < r; i++){
			p = sc.nextInt(); c = sc.nextInt();
			solve();
		}
		/**
		 * rñÇÝñÅAVbtµ½ ÆÅAêÔãÌDð\¦µÜ·B
		 */
		System.out.println(Hanafuda[1]);
		/**
		 * ±êÅªIíÁ½ÌÅtrueðÔµÜ·B
		 */
		return true;
	}
	static void solve(){
		/**
		 * HanafudazñÌã©çp-1ÚÜÅðAtempzñÉÞð³¹Ü·B
		 */
		for(int i = 1; i <= p-1; i++)
			temp[i] = Hanafuda[i];
		/**
		 * HanafudazñÌpÚ©çp+c-1ÚÜÅðÚ®µÜ·B
		 */
		for(int i = p; i < p+c; i++)
			Hanafuda[i-p+1] = Hanafuda[i];
		/**
		 * tempzñÉ¦ªµÄ¨¢½J[hðA é×«êÉßµÜ·B
		 * ¼OÌìÆÅHanafuda[c]ÜÅªÜÁÄ¢éÌÅA
		 * ÍHanafuda[c+1]©çÅ·B
		 */
		for(int i = 1; i <= p-1; i++)
			Hanafuda[c+i] = temp[i];
	}

}