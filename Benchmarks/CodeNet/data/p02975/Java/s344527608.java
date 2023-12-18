import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		
		boolean finished = false;
		for (int i = 0; i < n; i++) {
			// 最初の値はN通り
			for (int j = 0; j < n; j++) {
				if(i==j)continue;
				List<Integer> tmpArray = new ArrayList<>();
				List<Integer> referencedArray = copyList(list);
				tmpArray.add(referencedArray.get(i));
				tmpArray.add(referencedArray.get(j));


				referencedArray.remove(Math.max(i,j));
				referencedArray.remove(Math.min(i,j));
				// System.out.println();
				// System.out.println("i j  " + i + ","+j);
				// System.out.println("tmpArray " + tmpArray);
				// System.out.println("referencedArray " + referencedArray);



				// ここからNまでラクダを見ていく
				boolean isContinueing = true;
				for (int k = 2; k < n; k++) {
					// System.out.println("k " +k);

					int nextValue = tmpArray.get(k-1) ^ tmpArray.get(k-2);

					boolean isThere = false;
					for (int h = 0; h < referencedArray.size(); h++) {
						// System.out.println("h " + h);
						// System.out.println("referencedArray.get(h) " + referencedArray.get(h));
						// System.out.println("nextValue " + nextValue);

						if(referencedArray.get(h) == nextValue){
							// System.out.println("equal " );

							tmpArray.add(referencedArray.get(h));
							referencedArray.remove(h);
							isThere = true;
							break;
						}		
					}

					// System.out.println("isThere " + isThere);

					
					if(!isThere){
						isContinueing = false;
						break;
					}
				}

				if(isContinueing){
					// System.out.println("isContinueing " +isContinueing);
					int zero = tmpArray.get(n-1) ^ tmpArray.get(1);
					// System.out.println("zero " +zero);

					if(zero ==  tmpArray.get(0)){
						finished = true;
						break;
					};
				}
			}
			if(finished)break;
		}

		
		System.out.println(finished ? "Yes" : "No");

	}

	private static List<Integer> copyList(List<Integer> original){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < original.size(); i++) {
			list.add(original.get(i));
		}
		return list;
	}

}
