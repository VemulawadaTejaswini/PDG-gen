import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception{
		String answerText = "Possible";
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array;
		array = br.readLine().split(" ");
		int n = Integer.parseInt(array[0]);//ロープの本数
		int l = Integer.parseInt(array[1]);//長さL
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();

		int cnt = 0;
		for(String str:br.readLine().split(" ")){
			map.put(cnt, Integer.parseInt(str));
			cnt++;
		}

		int total = getLength(map);

		while(true){
			if(map.size() == 1){
				break;
			}
			if(total >= l){
				int first = map.firstKey();
				int last = map.lastKey();
				if(map.get(first) < map.get(last)){
					total -= map.get(first);
					answerList.add(first+1);
					map.remove(first);
				}else{
					total -= map.get(last);
					answerList.add(last);
					map.remove(last);
				}
			}else{
				answerText = "Impossible";
				break;
			}
		}
		System.out.println(answerText);
		if(answerText.equals("Possible")){
			for(Integer i:answerList){
				System.out.println(String.valueOf(i));
			}
		}
	}

	private static Integer getLength(TreeMap<Integer,Integer> map){
		int ret = 0;

		for(int i:map.values()){
			ret += i;
		}
		return ret;
	}
}
