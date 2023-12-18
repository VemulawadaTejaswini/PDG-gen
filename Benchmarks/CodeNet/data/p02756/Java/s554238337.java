
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		StringBuilder sb = new StringBuilder(br.readLine());
		int q = Integer.parseInt(br.readLine());

		String A = new String();

		Boolean orderFlg = new Boolean(false);

		A = sb.toString();

		for(int i = 0; i < q; i++) {

			StringBuilder sb2 = new StringBuilder(br.readLine());
			if (sb2.length() == 1) {
				if(!orderFlg) {
					orderFlg = true;
				}else {
					orderFlg = false;

				}
			}else if(sb2.toString().contains("1")) {

				if(!orderFlg) {
					A = sb2.toString().substring(sb2.toString().length() -1) + A ;
				}else {
					A = A + sb2.toString().substring(sb2.toString().length() -1);
				}
			}else {

				if(!orderFlg) {
					A = A + sb2.toString().substring(sb2.toString().length() -1);
				}else {
					A = sb2.toString().substring(sb2.toString().length() -1) + A ;
				}
			}
		}

		StringBuffer AA = new StringBuffer(A);
		if(orderFlg) {
			AA = AA.reverse();
		}
		System.out.print(AA.toString());
	}

}