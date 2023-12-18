import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ia, ib;
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<N;i++){
		    ia = sc.nextInt();
		    ib = sc.nextInt();
		    for(int j=0;j<ib;j++){
		    	array.add(ia);
		    }
		}
		Collections.sort(array);
		System.out.println(array.get(K-1));
		
	}
}