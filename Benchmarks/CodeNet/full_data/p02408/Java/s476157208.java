import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Boolean[][] cardSet = new Boolean[4][14];
		String[] str = new String[2];
		
		HashMap<String, Integer> mapPic = new HashMap<String, Integer>();
		HashMap<Integer, String> mapNum = new HashMap<Integer, String>();
		mapPic.put("S", 0);
		mapPic.put("H", 1);
		mapPic.put("C", 2);
		mapPic.put("D", 3);
		mapNum.put(0, "S");
		mapNum.put(1, "H");
		mapNum.put(2, "C");
		mapNum.put(3, "D");
		
		for (int i = 0; i < cardSet.length; i++) {
			for (int j = 1; j < cardSet[i].length; j++) {
				cardSet[i][j] = false;
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			str = br.readLine().split("\\s+");
			cardSet[mapPic.get(str[0])][Integer.parseInt(str[1])] = true;
		}
		
		br.close();
		
		for (int i = 0; i < cardSet.length; i++) {
			for (int j = 1; j < cardSet[i].length; j++) {
				if (!cardSet[i][j]) sb.append(mapNum.get(i)).append(" ").append(j).append("\n");
			}
		}
		System.out.println(sb);
	}
}