import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static int N;
	static int M;
	static int[] Pcity;
	static int[] Ycity;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Pcity = new int[M];
		Ycity = new int[M];
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0;i<M;i++){
			Pcity[i] = sc.nextInt();
			Ycity[i] = sc.nextInt();
			map.put(Ycity[i], Pcity[i]);
		}

		Map<Integer, Integer> tempMap = sortMapByKey(map);    //按Key进行排序
		Map<Integer, Integer> resultMap = sortMapByValue(tempMap);
		
		int Previous = 0;
		int Ynum = 1;
		for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
			int P = entry.getValue();
			if(P != Previous){
				Ynum = 1;
			}
            System.out.println(mendPosition(entry.getValue())+mendPosition(Ynum++));
            Previous = entry.getValue();
        }
		
		sc.close();
	}
	
	 /**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    private static Map<Integer, Integer> sortMapByKey(Map<Integer, Integer> map) {
    	
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<Integer, Integer> sortMap = new TreeMap<Integer, Integer>(new MapKeyComparator());
        sortMap.putAll(map);
        return sortMap;
    }
    
    /**
     * 使用 Map按value进行排序
     * @param map
     * @return
     */
    private static Map<Integer, Integer> sortMapByValue(Map<Integer, Integer> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(
                oriMap.entrySet());
        Collections.sort(entryList, new MapValueComparator());

        Iterator<Entry<Integer, Integer>> iter = entryList.iterator();
        Map.Entry<Integer, Integer> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }
    
    private static String mendPosition(int num){
    	String numTemp = String.valueOf(num);
    	String strnum = "";
    	for(int i=0;i<6-numTemp.length();i++){
    		strnum += "0";
    	}
    	strnum = strnum+numTemp;
    	return strnum;
    } 
}

class MapKeyComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer int1, Integer int2) {
		return int1.compareTo(int2);
	}
}
class MapValueComparator implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Entry<Integer, Integer> me1, Entry<Integer, Integer> me2) {

        return me1.getValue().compareTo(me2.getValue());
    }

}
	

