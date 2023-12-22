import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				line = line.trim();
				
				String[] words = line.split(" ");
				String longest , most;
				
				longest = most = words[0];
				int[] count = new int[words.length];
				int max = 0;
				
				for(int i = 0; i < words.length; i++) {
					if(longest.length() < words[i].length())
						longest = words[i];
					for(int j = i + 1; j < words.length; j++) {
						if(words[i].equals(words[j])) {
							count[i]++;
							if(count[i] > max){
								most = words[i];
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