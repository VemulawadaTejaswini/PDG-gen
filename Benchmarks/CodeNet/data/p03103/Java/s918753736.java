import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<String,Long>drinkHashMap=new HashMap<>();
		
		Scanner sc=new Scanner(System.in);
		
		//栄養ドリンクが売られているお店の数
		long N=sc.nextLong();
		//集めたい栄養ドリンクの個数
		long M=sc.nextLong();
		long count=0;
		long sum=0;
	
		for(int i=0;i<N;i++) {
			//ドリンクの価格
			String A=sc.next();
			//買える本数
			long B=sc.nextLong();
			
			drinkHashMap.put(A,B);
		}
		
		
		List<String>listKey=new ArrayList<String>(drinkHashMap.keySet());
		Collections.sort(listKey);
	
		for(int i=0;count<M;i++) {
			long a=Long.parseLong(listKey.get(i));
			long b=drinkHashMap.get((String.valueOf(a)));
			for(int j=1;j<=b;j++){
				if(count<M) {
					count++;
					sum+=Long.parseLong(listKey.get(i));
				}else{
					break;
				}
			}
		}
		
		System.out.println(sum);
	}

}