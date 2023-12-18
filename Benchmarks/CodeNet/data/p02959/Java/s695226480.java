	import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map <Long,Long> mapA = new HashMap<Long,Long> ();
		Map <Long,Long> mapB = new HashMap<Long,Long> ();
			// 整数の入力
		long n,a,b,b0,index,result;
		int counter;

		n = sc.nextInt();
		mapA.put(0L,0L);
		for(index=1;index<n+2;index++) {
			a = sc.nextLong();
			mapA.put(index,a);
			}
		mapB.put(0L,0L);
		for(index=1;index<n+1;index++) {
			b = sc.nextLong();
			mapB.put(index,b);
			}
		sc.close();
			
		
		result=0;
		counter=0;
		for(index=1L;index<n+2;index++) {
			a=mapA.get(index);
			b0=mapB.get(index-1);
			if(a>b0) {
				mapA.put(index, a-b0);
				result=result+b0;
				}
			else {
				mapA.put(index, a);
				result=result+a;
				}
			if(index==n+1) {
				break;	
			}
			a=mapA.get(index);
			b=mapB.get(index);
			if(a>b) {
				mapA.put(index, a-b);
				result=result+b;
				mapB.put(index, 0L);
				}
			else {
				mapA.put(index, 0L);
				result=result+a;
				mapB.put(index,b-a);
				}
			}
		System.out.print(result);

			// 出力
 
	}
}