import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

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
						
			//深さ優先探索を用いて、目当てのデータが出るまでループ
			while(true){
				int presentData[] = new int[10];
				presentData = queue.dequeue();
				boolean check = true;
				
				for (int i = 0; i < 8; i++){
					if (inputPuzzle[i] != presentData[i]){
						check = false;
						break;
					}	
				}
				
				if (check == true){
					System.out.println(presentData[8]);
					break;	
				}else{
					addNext(presentData, queue);
				}
			}
		}
	}
	
	
	
	
	
	
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
		
		if (placeOfZero < 3 && presentData[9] != 2){
			queue.enqueue(makeNextArray(presentData, 1, placeOfZero));
		}else if (placeOfZero >= 4 && presentData[9] != 1){
			queue.enqueue(makeNextArray(presentData, 2, placeOfZero));
		}
		
		if (placeOfZero % 4 <= 2 && presentData[9] != 4){
			queue.enqueue(makeNextArray(presentData, 3, placeOfZero));
		}else if (placeOfZero % 4 >= 1 && presentData[9] != 3){
			queue.enqueue(makeNextArray(presentData, 4, placeOfZero));
		}
	}
	
	
	
	
	
	
	
	//パズルの操作後の状態の配列を返す関数
	private static int[] makeNextArray(int tempPresentData[], int move, int placeOfZero){
		int[] presentData = tempPresentData.clone();
		presentData[8] += 1;
		
		switch (move){
			case 1:
				presentData[placeOfZero] = presentData[placeOfZero + 4];
				presentData[placeOfZero + 4] = 0;
				presentData[9] = 1;
				break;
				
			case 2:
				presentData[placeOfZero] = presentData[placeOfZero - 4];
				presentData[placeOfZero - 4] = 0;
				presentData[9] = 2;
				break;
		
		  	case 3:
		  		presentData[placeOfZero] = presentData[placeOfZero + 1];
				presentData[placeOfZero + 1] = 0;
				presentData[9] = 3;
				break;
				
			case 4:
				presentData[placeOfZero] = presentData[placeOfZero - 1];
				presentData[placeOfZero - 1] = 0;
				presentData[9] = 4;
				break;
		}
		return presentData;
	}
}
