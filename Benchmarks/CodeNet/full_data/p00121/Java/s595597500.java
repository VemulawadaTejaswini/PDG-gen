import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

//---------探索の順番を保存するキューのクラス-----------
class Queue{
	//<0〜7:パズルの現在の配置, 8:現在の深さ, 9:前回の位置からの移動の向き>
	LinkedList<int[]> data = new LinkedList<int[]>();
	
	//クラスの初期化
	Queue(){
		int initialData[] = {0,1,2,3,4,5,6,7,0,-1};
		data.add(initialData);
	}
	
	
	public void enqueue(int[] newData){
		data.add(newData);
	}
	
	public int[] dequeue(){
		int result[] = new int[10];
		result = data.get(0);
		data.remove(0);
		return result;
	}
}






//------------------------メインスレッド--------------------------
public class Main{
	public static void main(String[] args){
		//データ入力の準備
		Scanner sc = new Scanner(System.in);
		
		while (true){
			//入力されたデータの格納用変数
			int inputPuzzle[] = new int[8];
			
			//探索の順番を保存したキューのインスタンス
			Queue queue = new Queue();
			
			
			//データの入力
			for (int i = 0; i < 8; i++){
				inputPuzzle[i] = sc.nextInt();
			}
			
			//メモ化の準備
			ArrayList<Integer> memo = new ArrayList<Integer>();
						
			//深さ優先探索を用いて、目当てのデータが出るまでループ
			while(true){
				int presentData[] = new int[10];
				try {
					presentData = queue.dequeue();
				}catch(IndexOutOfBoundsException e){
					System.out.println("Not found");
					break;
				}
				
				//目的のデータかどうか判定
				boolean check = isEqual(inputPuzzle,presentData);
				
				//目的のデータだったら、結果を出力して終了
				if (check == true){
					System.out.println(presentData[8]);
					break;	
				}else{
					//以前のデータと一致するとき、そのデータは無視する
					int memoHash = hash(presentData);//盤面ごとにユニークなハッシュ値
					
					//ハッシュのリストを探索
					int index = Collections.binarySearch(memo, memoHash);
					
					if (index < 0){
						//メモを追加する場所を計算
						int memoNewPlace = (index * -1) - 1;
						
						//新しいメモの追加
						if (memo.size() < memoNewPlace){
							memo.add(memoHash);
						}else{
							memo.add(memoNewPlace, memoHash);
						}
						
						addNext(presentData, queue);
					}
				}
			}
		}
	}
	
	
	//-------------メインスレッド終了---------------
	
	
	
	
	//------------パズルを解く関数群--------------
	
	//入力されたデータのチェック
	private static boolean isEqual(int resultData[], int presentData[]){
		//入力されたパズルの配置と、条件が一致するかどうか調べる
		boolean result = true;
		
		for (int i = 0; i < 8; i++){
			if (presentData[i] != resultData[i]){
				result = false;
				break;
			}
		}
		return result;
	}
	
	
	
	//次のデータの追加
	private static void addNext(int presentData[], Queue queue){
		int placeOfZero = -1;
		
		//0が現在いる位置を探索
		for (int i = 0; i < 8; i++){
			if (presentData[i] == 0){
				placeOfZero = i;
				break;
			}	
		}
		
		if (placeOfZero <= 3 && presentData[9] != 2){
			queue.enqueue(makeNextArray(presentData, 1, placeOfZero));
		}
		
		if (placeOfZero >= 4 && presentData[9] != 1){
			queue.enqueue(makeNextArray(presentData, 2, placeOfZero));
		}
		
		if (placeOfZero % 4 <= 2 && presentData[9] != 4){
			queue.enqueue(makeNextArray(presentData, 3, placeOfZero));
		}
		
		if (placeOfZero % 4 >= 1 && presentData[9] != 3){
			queue.enqueue(makeNextArray(presentData, 4, placeOfZero));
		}
	}
	
	
	
	
	//パズルの操作後の状態の配列を返す関数
	private static int[] makeNextArray(int tempPresentData[], int move, int placeOfZero){
		int[] presentData =  new int[10];
		for (int i = 0; i < 10;i++){
			presentData[i] = tempPresentData[i];
		}
		presentData[8] += 1;
		presentData[9] = move;
		
		switch (move){
			case 1:
				presentData[placeOfZero] = presentData[placeOfZero + 4];
				presentData[placeOfZero + 4] = 0;
				break;
				
			case 2:
				presentData[placeOfZero] = presentData[placeOfZero - 4];
				presentData[placeOfZero - 4] = 0;
				break;
		
		  	case 3:
		  		presentData[placeOfZero] = presentData[placeOfZero + 1];
				presentData[placeOfZero + 1] = 0;
				break;
				
			case 4:
				presentData[placeOfZero] = presentData[placeOfZero - 1];
				presentData[placeOfZero - 1] = 0;
				break;
		}
		return presentData;
	}
	
	//------------パズルを解く関数群終了--------------
	
	
	
	//-------------------メモ化関数群--------------------
	
	//メモ化のデータ作成用ハッシュ関数
	private static int hash(int[] presentData){
		int result = 0;
		for (int i = 0; i < 8; i++){
			result += presentData[i] * Math.pow(8,i);
		}
		return result;
	}

	
	
		//二分探索を行い、既存のメモと同じだった場合は-1,初めてだったら挿入箇所を返す
	private static int binarySearch(int newHash, ArrayList<Integer> memo){
		int left = 0;
		int right = memo.size() - 1;
		int center = 0;
		
		while(left <= right){
			center = (left + right) / 2;
			if (memo.get(center) == newHash){
				return -1;
			}else if (memo.get(center) < newHash){
				left = center + 1;
			}else {
				right = center - 1;
			}
		}
		
		//メモに同じものが見つからなかった場合には、新しいハッシュの挿入箇所を返す
		return center + 1;
	}	
	
}
