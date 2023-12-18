

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		String t = br.readLine();

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		//1000個ごとに分割する感じ
		final int DIVID = 2000;
		boolean[][] charExists = new boolean[26][200000/DIVID];

		for(int i = 0; i < sArray.length; i++){
//			System.out.println(sArray[i]);
			charExists[sArray[i] - 'a'][i/DIVID] = true;
		}

		int i = 0;
		long result = 0;
		while(i < t.length()){
			boolean hit = false;

			for(int k = 0; k < charExists[0].length ; k++){
//				System.out.println("k = "+k);
//				System.out.println("t "+tArray[i]);
				if((k + 1)*DIVID < tArray.length &&  !charExists[tArray[i] - 'a'][k]){
//					result += Math.min(DIVID, Math.max(0, tArray.length - k*DIVID)) ;
//					System.out.println("result"+result);

					result += DIVID;
					continue;
				}
				for(int j = k * DIVID; j < s.length() && j < (k + 1) * DIVID ; j++){
//					System.out.println("j = "+j);
					result++;

					if(sArray[j] == tArray[i]){
						hit = true;
						i++;
						if(i == t.length()){
							break;
						}
					}
				}

				if(i == t.length()){
					break;
				}
			}
			if(!hit){
				System.out.println(-1);
				return;
			}
		}
		System.out.println(result);
	}

}
