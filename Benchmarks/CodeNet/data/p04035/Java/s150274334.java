import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Mapに1,長さ 2, 長さ…というように入れる
		// valueソートする
		// 小さい長さから引いていき、解けるか確認
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int len = scan.nextInt();
		String t1 = scan.nextLine();
		String t2 = scan.nextLine();
		String[] temp2 = t2.split(" ");

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t1 = br.readLine();
		String[] temp1 = t1.split(" ");
		String[] temp2 = br.readLine().split(" ");
		int num = Integer.parseInt(temp1[0]);
		int len = Integer.parseInt(temp1[1]);
		*/
		int rope = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < num; i++){
			rope += Integer.parseInt(temp2[i]);
			map.put(i+1, Integer.parseInt(temp2[i]));
		}
		// ソート
		List<Entry<Integer, Integer>> sortList = mapValueSort(map);
		ArrayList<Integer> showList = new ArrayList<Integer>();
		int knot = map.size() - 1;
		int i = 0;
		while(true){
			if(knot == 0){
				System.out.println("Possible");
				for(Integer j : showList){
					System.out.println(j);
				}
				break;
			}else if(knot != 0 && rope < len){
				System.out.println("Impossible");
				break;
			}else{
				rope -= sortList.get(i).getValue();
				showList.add(sortList.get(i).getKey());
				i++;
				knot--;
			}
		}
	}

	public static List<Entry<Integer, Integer>> mapValueSort(Map<Integer, Integer> map){
		//Map.Entryのリストを作成する
        List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

        //昇順
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

        /*
        //降順
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
            {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        */
		return list_entries;
	}
}