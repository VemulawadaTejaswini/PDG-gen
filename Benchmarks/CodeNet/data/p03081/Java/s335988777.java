import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n = sc.nextInt();
			int q = sc.nextInt();
			String s = sc.next();

			int index;
			int index2;

			// 呪文  nnumber  "XY"  X:key  Y: L or R
			Map <Integer,String> map= new HashMap<Integer,String> ();
			for(index=0;index<q;index++) {
				map.put(index,sc.next()+sc.next());
				//System.out.println(map.get(index));
				}
			sc.close();

			Map <Integer,Integer> beforeMap= new HashMap<Integer,Integer> ();
			// 最初は、全部に1体づついる。
			for(index=0;index<n;index++) {
				beforeMap.put(index, 1);
				}

			String key;
			String move;
			int result=n;
			int next;
			for(index=0;index<q;index++) {
				key=map.get(index).substring(0,1);
				move=map.get(index).substring(1,2);
				if(move.equals("L")) {
					for(index2=0;index2<n;index2++) {
						if(s.substring(index2,index2+1).equals(key)) {
							if(index2==0) {
								result=result-beforeMap.get(0);
								beforeMap.put(0, 0);
								//System.out.println("L:"+index);
								}
							else{
								next=beforeMap.get(index2);
								beforeMap.put(index2-1, beforeMap.get(index2-1)+next);
								beforeMap.put(index2, 0);
								}
							}
						else {
							// 等しくないときは動かないので、何もしない。
							}
						}
					}
				else {  // moveが"R"
					for(index2=n-1;index2>=0;index2--) {
						if(s.substring(index2,index2+1).equals(key)) {
							if(index2==n-1) {
								result=result-beforeMap.get(n-1);
								beforeMap.put(n-1, 0);
								//System.out.println("R:"+index);
								}
							else{
								next=beforeMap.get(index2);
								beforeMap.put(index2+1, beforeMap.get(index2+1)+next);
								beforeMap.put(index2, 0);
								}
							}
						else {
							// 等しくないときは動かないので、何もしない。
							}
						}
					}
				//途中経過の確認
				//for(index2=0;index2<n;index2++) {
				//	System.out.print(beforeMap.get(index2));
				//	}
				//System.out.println("");
				}
			// 結果の出力
	    	System.out.println(result);
	}
}