import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<String> resultList = new ArrayList<String>();

		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N != 0) {
        	List<String> line = checkRevenue(N ,br);
        	if(line.size() == 0) {
        		resultList.add("NA");
        	} else {
        		resultList.addAll(line);
        	}
        	N = Integer.parseInt(br.readLine());
        }
        
        // ???????????????
     	Iterator<String> k = resultList.iterator();
    	while (k.hasNext()) {
    		System.out.println(k.next());
    	}
	}

	private static List<String> checkRevenue(
								int N, 
								BufferedReader br
	) throws Exception {
		List<String> resultRevenue = new ArrayList<String>();
		List<String> idList = new ArrayList<String>();
		Map<String, BigDecimal> revenue = new HashMap<String, BigDecimal>();;
		for(int i = 0; i < N; i++) {
			String[] line_Array = br.readLine().split(" ");
			String id = line_Array[0];
			BigDecimal x = new BigDecimal(line_Array[1]);
			BigDecimal y = new BigDecimal(line_Array[2]);
			revenue = addRevenue(id, x, y, idList, revenue);
		}
		for(int j = 0; j < idList.size(); j++) {
			String id = idList.get(j);
			if((revenue.get(id)).compareTo(BigDecimal.valueOf(1000000)) >= 0) {
				resultRevenue.add(idList.get(j));
			}
		}
		return resultRevenue;
	}
	
	private static Map<String, BigDecimal> addRevenue(
											String id, 
											BigDecimal x, 
											BigDecimal y,
											List<String> idList,
											Map<String, BigDecimal> revenue
	) {
		BigDecimal total = BigDecimal.valueOf(0);
		if(revenue.containsKey(id)) {
			total = revenue.get(id);
			total = total.add(x.multiply(y));
			revenue.put(id, total);
		} else {
			total = x.multiply(y);
			revenue.put(id, total);
			idList.add(id);
		}
		return revenue;
	}
}