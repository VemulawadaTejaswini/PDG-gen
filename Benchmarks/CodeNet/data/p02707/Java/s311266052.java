		import java.util.*;
		 import java.util.stream.Collectors;
		 import java.util.function.Function;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<N-1;i++) {
			int A = sc.nextInt();
			list.add(A);
		}
		Map<Integer, Long> counts = list.stream()
			    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//リストの確認
		//System.out.println(list);
		//マップの確認
			//System.out.println(counts);
       for(int j =1 ; j < N ;j++){
    	   Long key =counts.get(j);
    	  if(key == null) {
    		  System.out.println(0);
    	  }
    	  else {
    		  int key2 = key.intValue();
         System.out.println(key2);
       }
       }

	}

}
