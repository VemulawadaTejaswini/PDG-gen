

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		String str;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		str = br.readLine();
		String [] list = str.split(" ",0);
		int i= 0;
		
		for(i = 0; i < list.length * 2; i++){
		while (true) {
			num = Integer.parseInt(str);
			numList.add(num);
			if (num == 0) {
				break;
			}

		}
		}
		int length = i;
		for (int j = 0; j < length; j++) {
			System.out.println("Case " + (j + 1) + ": " + numList.get(j));
		}

	}

}