
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			//ハッシュを用意する
			HashMap<Integer,Long> list = new HashMap<Integer,Long>();
			//入力順を記憶する配列
			ArrayList<Integer> inputlist = new ArrayList<Integer>();
			for(int i=0; i < n; i++){
				int num = sc.nextInt();
				long sales = sc.nextLong();
				long price = sc.nextLong();
				long sum = sales * price;
				//すでにあるのならカウント追加
				if(list.containsKey(num)){
					list.put(num, (list.get(num) + sum ));
				}
				else{
					list.put(num, sum);
					//配列に格納
					inputlist.add(num);
				}
			}

			boolean flg = false;
			for(int key: inputlist){
				if(list.get(key) >= 1000000){
					System.out.println(key);
					flg = true;
				}
			}
			if(!flg){
				System.out.println("NA");
			}

			n = sc.nextInt();
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}