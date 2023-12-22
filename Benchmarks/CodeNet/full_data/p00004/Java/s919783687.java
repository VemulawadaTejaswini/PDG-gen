import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String abcdef = null;
		String[] aToF = null;
		int[] aToFNum = null;
		int x = 0;
		int y = 0;

		try {
			abcdef = br.readLine();
			aToF = abcdef.split(" ");
			aToFNum = new int[aToF.length];
			for(int i = 0;i<aToF.length;i++){
				aToFNum[i] = Integer.parseInt(aToF[i]);
			}
		} catch (IOException e) {

		}
		//a or d が負であれば、正に直す
		if(aToFNum[0] < 0){
			aToFNum[0] *= -1;
			aToFNum[1] *= -1;
			aToFNum[2] *= -1;
		}
		if(aToFNum[3] < 0){
			aToFNum[3] *= -1;
			aToFNum[4] *= -1;
			aToFNum[5] *= -1;
		}

		if(aToFNum[0] != aToFNum[3]){
			aToFNum[0] *= aToFNum[3];
			aToFNum[1] *= aToFNum[3];
			aToFNum[2] *= aToFNum[3];
			aToFNum[3] *= aToFNum[0];
			aToFNum[4] *= aToFNum[0];
			aToFNum[5] *= aToFNum[0];
		}
		int temp1 = aToFNum[1] - aToFNum[4];
		int temp2 = aToFNum[2] - aToFNum[5];

		y = temp2 / temp1;

		x = (aToFNum[2] - aToFNum[1] * y) / aToFNum[0];

		System.out.println(x +" "+y);
	}
}