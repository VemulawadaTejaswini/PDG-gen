import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 要素数
		int K = sc.nextInt();
		//加算数
		int N = sc.nextInt();
		int sum = 0;
		ArrayList l = new ArrayList();
		while(sc.hasNextLine()){
		    l.add(sc.nextInt());
		}
		
		//ArrayListの要素を降順にソート
		Collections.sort(l, Comparator.reverseOrder());
		for(int i = 0; i < N; i++){
		    sum += ((Integer)l.get(i)).intValue();
		}
		System.out.println(sum);

	}
}