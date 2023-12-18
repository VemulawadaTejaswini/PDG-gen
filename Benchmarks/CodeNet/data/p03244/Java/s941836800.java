import java.util.*;
import java.math.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> oddList = new ArrayList<>();
		List<Integer> evenList = new ArrayList<>();

		for(int i=0;i<n;i=i+2){
			oddList.add(sc.nextInt());
			evenList.add(sc.nextInt());
		}
		Collections.sort(oddList);
		Collections.sort(evenList);

		Map<Integer, Long> oddMap = new HashMap<>();
		Map<Integer, Long> evenMap = new HashMap<>();
		//それぞれで一番多い数と二番目を特定しておく
		oddMap = oddList.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
        );
        evenMap = evenList.stream().collect(
                Collectors.groupingBy(x -> x, Collectors.counting())
        );

		long maxOdd =0;
		long maxEven =0;
		long secondOdd =0;
		long secondEven =0;
		// long thirdOdd =0;
		// long thirdEven =0;
		int maxOddValue =0;
		int maxEvenValue =0;
		int secondOddValue =0;
		int secondEvenValue =0;
		// int thirdOddValue =0;
		// int thirdEvenValue =0;
		for(Iterator<Integer> iterator = oddMap.keySet().iterator(); iterator.hasNext(); ) {
		    Integer key = iterator.next();
		    // System.out.println(key + " => " + oddMap.get(key));
		    if(maxOdd<=oddMap.get(key)){
		    	// thirdOdd =secondOdd;
		    	// thirdOddValue =secondOddValue;
		    	secondOdd =maxOdd;
		    	secondOddValue =maxOddValue;

		    	maxOdd=oddMap.get(key);
		    	maxOddValue = key;
		    }
		}

		for(Iterator<Integer> iterator = evenMap.keySet().iterator(); iterator.hasNext(); ) {
		    Integer key = iterator.next();
		    // System.out.println(key + " => " + evenMap.get(key));
		    if(maxEven<=evenMap.get(key)){
		    	// thirdEven =secondEven;
		    	// thirdEvenValue =secondEvenValue;
		    	secondEven =maxEven;
		    	secondEvenValue =maxEvenValue;

		    	maxEven=evenMap.get(key);
		    	maxEvenValue = key;
		    }
		}

		//２つが一緒の場合はどちらかをずらす。そうでなければその数のまま
		if(maxEvenValue!=maxOddValue){
			System.out.println(n-maxEven-maxOdd);
		}else{
			//decide change is which
			if(maxOdd>maxEven){
				// System.out.println("oddの方が多い");
				System.out.println(n-secondEven- maxOdd);
			}else if (maxOdd<maxEven){
				// System.out.println("evenの方が多い");
				System.out.println(n-maxEven- secondOdd);
			}else{
				// System.out.println("同数だから2つ目のやつの多い方を採用する");
				System.out.println(n-maxEven- Math.max(secondOdd,secondEven));
			}
		}
		// System.out.println("log");
		// System.out.println(oddMap);
		// System.out.println(evenMap);

	}

}