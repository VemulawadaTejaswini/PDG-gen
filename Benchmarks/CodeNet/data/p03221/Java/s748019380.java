import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
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
		Map<Integer,Map<Integer,Integer>> PYcityMap = new HashMap<Integer,Map<Integer,Integer>>();
		
		//组装结构
		for(int i=0;i<M;i++){
			Pcity[i] = sc.nextInt();
			Ycity[i] = sc.nextInt();
			Map<Integer,Integer> maptemp = PYcityMap.get(Pcity[i]);
			if(null == maptemp){
				Map<Integer,Integer> PYcityMaptemp = new HashMap<Integer,Integer>();
				PYcityMaptemp.put(Ycity[i], 0);
				PYcityMap.put(Pcity[i], PYcityMaptemp);
			}
			else
			{
				maptemp.put(Ycity[i], 0);
				PYcityMap.put(Pcity[i], maptemp);
			}
		}
		
		//区域内排序
		for(Integer maxMapKey:PYcityMap.keySet()){
			Map<Integer,Integer> temp = sortMapByKey(PYcityMap.get(maxMapKey));
			int index=1;
			for(Integer minMapKey:temp.keySet()){
				temp.put(minMapKey,index++);
			}
			PYcityMap.put(maxMapKey, temp);
		}
		
		//输出
		for(int i=0;i<M;i++){
			System.out.println(mendPosition(Pcity[i])+mendPosition(PYcityMap.get(Pcity[i]).get(Ycity[i])));
		}
		
		sc.close();
	}
	
	 /**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static Map<Integer,Integer> sortMapByKey(Map<Integer,Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<Integer,Integer> sortMap = new TreeMap<Integer,Integer>(
                new PY1MapKeyComparator());
        
        sortMap.putAll(map);

        return sortMap;
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

class PY1MapKeyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer str1, Integer str2) {
        
        return str1.compareTo(str2);
    }
}