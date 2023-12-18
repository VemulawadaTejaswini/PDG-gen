import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<Long,Long>drinkHashMap=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		
		//栄養ドリンクが売られているお店の数
		long N=sc.nextLong();
		//集めたい栄養ドリンクの個数
		long M=sc.nextLong();
		long count=0;
		long sum=0;
	
		for(int i=0;i<N;i++) {
			//ドリンクの価格
			long A=sc.nextLong();
			//買える本数
			long B=sc.nextLong();
			
			drinkHashMap.put(A,B);
		}
		
		
		List<Long>listKey=new ArrayList<>(drinkHashMap.keySet());
		Collections.sort(listKey);
	
		for(int i=0;count<M;i++) {
			long a=listKey.get(i);
			long b=drinkHashMap.get(a);
			for(int j=1;j<=b;j++){
				if(count<M) {
					count++;
					sum+=listKey.get(i);
				}else{
					break;
				}
			}
		}
		
		System.out.println(sum);
	}

}
