import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int input_num = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//単語の入力とカウント
		for(int i=0;i<input_num;i++){
			String str = sc.next();
			if(map.get(str) == null){
				map.put(str, 1);
			}else{
				map.put(str, map.get(str) + 1);
			}
		}
		
		int max = 0;
		//最大値の取得
		for (int val : map.values()) {
			if(val > max) max = val;
		}
		
		//System.out.println(max);
		
		//最大値に等しいkeyを格納するリストの定義
		List<String> list = new ArrayList<String>();
		
		//最大値に等しいvalueを持つkeyの取得
		for (String key : map.keySet()) {
			if(map.get(key) == max) list.add(key);
		}
		
		//辞書順にソート
		Collections.sort(list);
		
		//出力
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		/*
		for(Map.Entry<String, Integer> entry : map.entrySet()){
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}*/
		
		
	}
}
		
		
