import java.util.*;//ScannerNXðg¤ÌÉKvB
public class Main {
	static Scanner sc = new Scanner(System.in);//±ÌêsÍo¦Üµå¤
	/**
	 * @param N Æ°Ìl
	 * @param K@tÌíÞ
	 * @param blood_quantity@tÌÊBâè¶ÌrÉ ½éB
	 * @param data@zSªz¤tÌf[^Bâè¶ÌaÉ ½éB
	 */
	static int N, K;
	static int[] blood_quantity;
	static int[][] data;

	public static void main(String[] args) {
		/**
		 * |Cg
		 * âè¶Éu»ê¼êÌf[^ZbgÉÎµÄvÆ éÌÅA
		 * mjOðÆéÜÅüÍðó¯t¯éKvª éB
		 * ÈÌÅAboolean^Ìread()Öðwhile¶É¢êé±ÆÉæèA
		 * N=K=0ðÆÁÄAread()ÖªfalseðÔ·ÜÅslove()Öð®©µÄ
		 * ððoÍ·éB
		 */
		while(read()){
			slove();
		}
	}
	static boolean read(){
		N = sc.nextInt(); K = sc.nextInt();
		if(N == 0 && K == 0)
			return false;
		
		blood_quantity = new int[K];
		for(int i = 0; i < K; i++)
			blood_quantity[i] = sc.nextInt();
		
		data = new int[N][K];
		for(int i = 0; i < N; i++){
			for(int j = 0; j < K; j++){
				data[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	static void slove(){
		/**
		 * Æè ¦¸oÍµÄ¨«Ü·B
		 *
		for(int i = 0; i < blood_quantity.length; i++)
			System.out.print(blood_quantity[i] + " ");
		
		System.out.println();
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < K; j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		*/
		int[] needs_blood = new int[K];
		
		for(int j = 0; j < K; j++){
			for(int i = 0; i < N; i++){
				needs_blood[j] += data[i][j];
			}
		}
		/*for(int k = 0; k < needs_blood.length; k++)
			System.out.print(needs_blood[k] +" ");
		System.out.println();
		*/
		int flag = 0;
		for(int x = 0; x < needs_blood.length; x++){
			if(needs_blood[x] > blood_quantity[x])
				flag++;
		}
		if(flag != 0){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}