import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		List<String> resultList = new ArrayList<String>();
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
        	String[] line = br.readLine().split(" ");
        	for(int j = 0; j < line.length; j++) { 
        		
        		int y = 0;
        		if(line[j].length() > 7) {
        			int st = 0;
        			int end = 7;
        			String resultWord = "";
        			for (int m = 0; m < line[j].length(); m++) {
        				String word = line[j].substring(st, end);
        				if (word.equals("Hoshino")) {
        					resultWord = resultWord + "Hoshina";
        					st = st + 7;
    						end = end + 7;
        					if (line[j].length() < end) {
        						break;
        					}
                		} else {
                			resultWord = resultWord + line[j].substring(st, st + 1);
                			st++;
                			end++;
                			if (line[j].length() < end) {
        						break;
        					}
                		}
        			}
        			line[j] = resultWord + line[j].substring(st, line[j].length());
        		} else {
        			if (line[j].equals("Hoshino")) {
            			line[j] = "Hoshina";
            		}
        		}
        	}
        	String result = "";
        	for(int k = 0; k < line.length; k++) { 
        		result = result + line[k] + " ";
        	}
        	resultList.add(result.trim());
        }
        for(int i = 0; i < resultList.size(); i++) {
        	if(i != resultList.size() - 1) {
        		System.out.println(resultList.get(i));
        	} else {
        		System.out.print(resultList.get(i));
        	}
        }
	}
}