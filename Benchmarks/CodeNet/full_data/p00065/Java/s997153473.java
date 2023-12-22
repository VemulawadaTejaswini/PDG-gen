
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		HashMap<Integer, Integer> lastmonth = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> thismonth = new HashMap<Integer, Integer>();
		while(!n.equals("")){
			String [] data = n.split(",");
			int num = Integer.parseInt(data[0]);
			//すでにあるのならカウント追加
			if(lastmonth.containsKey(num)){
				lastmonth.put(num, (lastmonth.get(num) + 1));
			}
			else{
				lastmonth.put(num, 1);
			}
			n = sc.nextLine();

		}
		while(sc.hasNext()){
			n = sc.nextLine();
			String [] data = n.split(",");
			int num = Integer.parseInt(data[0]);
			//すでにあるのならカウント追加
			if(thismonth.containsKey(num)){
				thismonth.put(num, (thismonth.get(num) + 1));
			}
			else{
				thismonth.put(num, 1);
			}
		}

		//比較
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		for(int key: lastmonth.keySet()){
			if(thismonth.containsKey(key)){
				ansList.add(key);
			}
		}
		Collections.sort(ansList);

		//出力
		for(int anskey: ansList){
			System.out.println(anskey + " " + (lastmonth.get(anskey) + thismonth.get(anskey)));
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}