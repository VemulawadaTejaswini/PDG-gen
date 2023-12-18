import java.util.ArrayList;
import java.util.*;


//ペアセットを同じ値の合成がまだできていない
class Main{
	public static void main(String[] args){

		//permutation
		List<Integer> perm = new ArrayList<>();
		//swap pair
		//List<Integer> pair = new ArrayList<>();
		Pair pairs = new Pair();

		//Count
		int count = 0;

		Scanner scan = new Scanner(System.in);

		//scan
		String[] maxCount = scan.nextLine().split(" ");
		//permutation size
		int permMax = Integer.parseInt(maxCount[0]);
		//pair size
		int pairMax = Integer.parseInt(maxCount[1]);

		String[] strPerms = scan.nextLine().split(" "); 

		//string to int
		for(String strPerm : strPerms){
			perm.add(Integer.parseInt(strPerm));
		}

		//set pair
		for(int i = 0; i < pairMax; i++){

			String[] pair = scan.nextLine().split(" ");
			pairs.setPair(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
		}

		//join same pair
		pairs.joinSamePair();

		//sum
		for(int i = 0; i < perm.size(); i++){

			//添字の要素と一致した場合
			if(i + 1 == perm.get(i)){
				count++;
				//System.out.println("i:" + (i+1) + " 添字と同じ");
				continue;

			}

			//一致しなかった場合
			//swap可能な範囲がある場合に検索	
			if(!pairs.getPair(i + 1).isEmpty()){
				for(Integer value : pairs.getPair(i + 1)){
					//
					if(i + 1 == perm.get(value - 1)){
						count++;
						//System.out.println("i:" + (i+1) + "");
						break;
					}
				}	
			}

		}

		System.out.println(count);

		//pairs.printAll();


	}
}

class Pair{
	private List<Set<Integer>> swapPair;

	public Pair(){
		swapPair = new ArrayList<>();
		swapPair.add(new HashSet<Integer>());
	}

	//ペアをチェックして追加していく
	public void setPair(int a, int b){

		//入力した数値がペアリストが含まれていた場合片方を追加
		for(Set<Integer> set : this.swapPair){
			if(set.contains(a)){
				set.add(b);
				return;
			}else if (set.contains(b)){
				set.add(a);
				return;
			}
		}	

		//入力した数値がペアリストに無かった時両方追加
		Set<Integer> set = new HashSet<>();
		set.add(a);
		set.add(b);
		this.swapPair.add(set);
	}

	public List<Set<Integer>> getPair(){
		return this.swapPair;
	}

	//添字を含むペアのSetを返す
	public Set<Integer> getPair(int i){
		Set<Integer> setPair = new HashSet<>();

		for(Set<Integer> set : this.swapPair){
			if(set.contains(i)){
				setPair = set;	
			}
		}

		return setPair;
	}

	//同じ添字がある場合結合
	public void joinSamePair(){
		boolean flag = true;
		while(flag){
			for(int i = 0; i < swapPair.size() - 1; i++){
				Set<Integer> set1 = swapPair.get(i);
				Set<Integer> set2 = swapPair.get(i + 1);
				//set1とset2に同じ要素がある場合
				if(set1.stream().anyMatch(set2::contains)){
					swapPair.get(i).addAll(set2);
					swapPair.remove(i + 1);
					break;
				}
				//最後の要素であれば終了
				flag = false;
			}	
		}	
	}

	//データ確認用
	public void printAll(){
		for(Set<Integer> set : swapPair){
			for(Integer i : set){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
