import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> field = new ArrayList<>(Arrays.asList(0,0,0));
		long scoreCount = 0;
		int outCount = 0;
		int finishedGame = 0;
		try {
			int gameNumber = Integer.parseInt(br.readLine());
			while (finishedGame < gameNumber) {
				String line = br.readLine();
				if(line== null) {
					break;
				}
				if(line.equals("HIT")) {
					if(field.get(2)==1) {
						scoreCount++;
					}
					field.remove(2);
					field.add(0, 1);
				}else if(line.equals("OUT")) {
					outCount++;
					if (outCount == 3) {
						System.out.println(scoreCount);
						scoreCount = 0;
						outCount = 0;
						field = new ArrayList<>(Arrays.asList(0,0,0));
						finishedGame++;
					}
				}else if(line.equals("HOMERUN")) {
					scoreCount += 1 + field.stream().filter(base -> base==1).count();
					field = new ArrayList<>(Arrays.asList(0,0,0));
				}
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}