import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] p = new int[30];
		int[] pn = new int[30];
		for(int i=0; i<14; i++){
			p[i] = 0;
		}
		for(int i=14; i<30; i++){
			p[i] = 1;
		}
		
		int a = 1000000007;
		
		for(int i=2; i<n; i++){
			pn[0] = (p[0] + p[14])%a;
			pn[1] = (p[0] + p[14])%a;
			pn[2] = (p[0] + p[14])%a;
			pn[3] = (p[0] + p[14])%a;
			pn[4] = (p[1] + p[15])%a;
			pn[5] = (p[1] + p[15])%a;
			pn[6] = (p[1] + p[15])%a;
			pn[7] = (p[1] + p[15])%a;
			pn[8] = (p[2] + p[16])%a;
			pn[9] = (p[2] + p[16])%a;
			pn[10] = (p[2] + p[16])%a;
			pn[11] = (p[3] + p[17])%a;
			pn[12] = (p[3] + p[17])%a;
			pn[13] = (p[3] + p[17])%a;
			pn[14] = (p[4] + p[8] + p[11] + p[18] + p[22] + p[26])%a;
			pn[15] = (p[4] + p[8] + p[11] + p[18] + p[22] + p[26])%a;
			pn[16] = (p[4] + p[8] + p[18] + p[22])%a;
			pn[17] = (p[4] + p[8] + p[11] + p[18] + p[22] + p[26])%a;
			pn[18] = (p[5] + p[9] + p[12] + p[19] + p[23] + p[27])%a;
			pn[19] = (p[5] + p[9] + p[12] + p[19] + p[23] + p[27])%a;
			pn[20] = (p[5] + p[9] + p[19] + p[23] + p[27])%a;
			pn[21] = (p[5] + p[9] + p[12] + p[19] + p[23] + p[27])%a;
			pn[22] = (p[6] + p[10] + p[20] + p[24] + p[28])%a;
			pn[23] = (p[6] + p[10] + p[20] + p[24] + p[28])%a;
			pn[24] = (p[6] + p[10] + p[20] + p[24] + p[28])%a;
			pn[25] = (p[6] + p[10] + p[20] + p[24] + p[28])%a;
			pn[26] = (p[7] + p[13] + p[21] + p[25] + p[29])%a;
			pn[27] = (p[7] + p[13] + p[21] + p[25] + p[29])%a;
			pn[28] = (p[21] + p[25] + p[29])%a;
			pn[29] = (p[7] + p[13] + p[21] + p[25] + p[29])%a;
			
			for(int j=0; j<30; j++){
				p[j] = pn[j];
			}
		}
		
		for(int i=0; i<30; i++){
			ans += p[i];
			ans %= a;
		}
		
		System.out.println(ans);
	}
}
