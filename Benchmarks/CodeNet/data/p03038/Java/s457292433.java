import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			long n,m,a,b,c,change,value,changeAll;
			long index,index2,result;
			n = sc.nextLong();
			m = sc.nextLong();
			Map <Long,Long> mapCard = new TreeMap<Long,Long> ();
			Map <Long,Long> mapCard2 = new TreeMap<Long,Long> ();

			for(index=0;index<n;index++) {
				a = sc.nextLong();
				if(mapCard.containsKey(a)){
					value=mapCard.get(a);
					mapCard.put(a,value+1L);
					}
				else {
					mapCard.put(a,1L);
					}
				}
			
			for(Long key:mapCard.keySet()) {
				value=mapCard.get(key);
				System.out.println("key:"+key+"  value:"+value);
				}

			for(index=0;index<m;index++) {
				b = sc.nextLong();
				c = sc.nextLong();
				changeAll=0;
				LoopX: for(Long key:mapCard.keySet()) {
					if(key<c) {
						value=mapCard.get(key);
						if(b<value) {
							mapCard.put(key,value-b);
							change=b;
							}
						else {
							mapCard.put(key,0L);
							change=value;
							}
						changeAll=changeAll+change;
						b=b-change;
						if(b<=0) {
							break LoopX;
							}
						}
					}
				if(mapCard.containsKey(c)){
					value=mapCard.get(c);
					mapCard.put(c,value+changeAll);
					}
				else {
					mapCard.put(c,changeAll);
					}
				
				for(Long key:mapCard.keySet()) {
					value=mapCard.get(key);
					System.out.println("key:"+key+"value:"+value);
					}
				}
			sc.close();

			result=0;
			for(Long key:mapCard.keySet()) {
				value=mapCard.get(key);
				result=result+key*value;
				}
				// 出力
			System.out.println(result);

	}
}