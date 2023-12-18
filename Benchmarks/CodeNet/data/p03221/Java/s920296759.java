import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, ArrayList> mapList = new HashMap<Integer, ArrayList>();
		int[][] valAry = new int[M][2];
		
		for(int i = 0; i < M ; i++){
			int P = sc.nextInt();
			int Y = sc.nextInt();
			valAry[i][0] = P;
			valAry[i][1] = Y;
			ArrayList list = mapList.containsKey(P) ? mapList.get(P) : new ArrayList();
			list.add(Y);
			mapList.put(P, list);
		}
		Iterator<Entry<Integer, ArrayList>> it = mapList.entrySet().iterator();
		while (it.hasNext()) {
			ArrayList list = it.next().getValue();
			Collections.sort(list);
		}
		for(int i = 0; i < M ; i++){
			System.out.println(String.format("%06d", valAry[i][0])+String.format("%06d", mapList.get(valAry[i][0]).indexOf(valAry[i][1])+1));
		}
	}
}