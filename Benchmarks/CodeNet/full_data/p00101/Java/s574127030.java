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
        		if (line[j].equals("Hoshino")) {
        			line[j] = "Hoshina";
        		}
        	}
        	String result = "";
        	for(int k = 0; k < line.length; k++) { 
        		result = result + line[k] + " ";
        	}
        	resultList.add(result.trim());
        }
        Iterator<String> it = resultList.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}
}