import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<TreeMap> mapList = new ArrayList<TreeMap>();
		int[][] valAry = new int[M][2];
		
		for(int i = 0; i < N ; i++){
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			mapList.add(map);
		}
		for(int i = 0; i < M ; i++){
			int P = sc.nextInt();
			int Y = sc.nextInt();
			mapList.get(P-1).put(Y, i);
			valAry[i][0] = P;
			valAry[i][1] = Y;
		}
		for(Map map : mapList){
			Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
			int i = 1;
			while (it.hasNext()) {
				Map.Entry<Object, Object> entry = it.next();
				entry.setValue(i);
				i++;
			}
			System.out.println();
		}
		for(int i = 0; i < M ; i++){
			System.out.println(format(valAry[i][0])+format(mapList.get(valAry[i][0]-1).get(valAry[i][1])));
		}
		
	}
	
	public static String format(int val){
		if(val > 99999) return "" + val;
		else if(val > 9999) return "0" + val;
		else if(val > 999) return "00" + val;
		else if(val > 99) return "000" + val;
		else if(val > 9) return "0000" + val;
		else if(val > 0) return "00000" + val;
		else return "";
	}
}