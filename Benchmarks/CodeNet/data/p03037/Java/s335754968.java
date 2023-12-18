import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = in.readLine();
			String[] input = line.split(" ");
			int N = Integer.parseInt(input[0].trim());
			int M = Integer.parseInt(input[1].trim());
			ArrayList<Integer> LR = new ArrayList<>();
			line = in.readLine();
			while(line != null) {
				input = line.split(" ");
				LR.add(Integer.parseInt(input[0].trim()));
				LR.add(Integer.parseInt(input[1].trim()));
				line = in.readLine();
			}
//			for(int i = 0;i < LR.size();i++) {
//				int num = LR.get(i);
//				System.out.println(num);
//			}
			
			int[] num = new int[LR.size()];
			int max = 0;
			int min = 10^5;
			
			for(int i = 0;i < LR.size();i++) {
				num[i] = LR.get(i);
				if(i % 2 == 0) {
					max = Math.max(max, num[i]);
				}else {
					min = Math.min(min, num[i]);
				}
			}
			
			System.out.print(min - max + 1);

		} catch (IOException e) {
			System.out.print(e);
		}
		
	}

}
