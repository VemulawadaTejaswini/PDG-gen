import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				line = line.trim();
				
				String[] splitedLine = line.split(" ");
				String longest = "", most = null;
				int[] count = new int[splitedLine.length];
				int max = 0;
				
				for(int i = 0; i < splitedLine.length; i++) {
					if(longest.length() < splitedLine[i].length()) longest = splitedLine[i];
					for(int j = i + 1; j < splitedLine.length; j++) {
						if(splitedLine[i].equals(splitedLine[j])) {
							count[i]++;
							if(count[i] > max){
								most = splitedLine[i];
								max = count[i];
							}
						}
					}
				}
				
				System.out.println(most + " " + longest);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}