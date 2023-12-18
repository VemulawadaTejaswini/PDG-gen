import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main {
        static int  PRE,CITY ;
        static int arr[][];
        public static void main (String args[]) throws Exception{
            Scanner sc = new Scanner(System.in);
            PRE = sc.nextInt();
            CITY = sc.nextInt();
            arr = new int[CITY][2];
            for(int i = 0; i<CITY; i++){
            	arr[i][0]= sc.nextInt();
            	arr[i][1] = sc.nextInt();
            }
            sc.close();
            generateCityIndex(arr,CITY);
        }

	private static void generateCityIndex(int[][] arr,int CITY) {
			//省
			Map<String, String> province = new LinkedHashMap<>();
			//市
			Map<String, List<Integer>> city = new HashMap<>();
			for (int i = 0; i < CITY; i++) {
				String proID = String.format("%06d", arr[i][0]);
				String in = arr[i][0]+" "+arr[i][1];
				province.put(in, proID);
				
				List<Integer> cityLst = city.get(proID);
				if (null == cityLst) {
					cityLst = new LinkedList<>();    
				} 
				cityLst.add(arr[i][1]);
				city.put(proID, cityLst);
			}
	
			for (Entry<String, List<Integer>> entry : city.entrySet()) {
				String key = entry.getKey();
				ArrayList<Integer> list = new ArrayList<>(entry.getValue());
				Collections.sort(list);
				city.put(key, list);
			}
	
			for (Entry<String, String> entry : province.entrySet()) {
				String proID = entry.getValue();
				List<Integer> cityLst = city.get(proID);
				String cityID = entry.getKey().split("\\s+")[1];
				int cityIndex = Collections.binarySearch(cityLst,
						Integer.parseInt(cityID));
				String output = proID + String.format("%06d", cityIndex + 1);
				System.out.println(output);
			}
		}
}