import java.util.*;
import java.math.*;
 import static java.util.stream.Collectors.toList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入

		int n = sc.nextInt();
		List<List<Integer>> position = new ArrayList<>();
		
		for(int i=0;i<n;i++){
		List<Integer> xy = new ArrayList<>();
		xy.add(sc.nextInt());
		xy.add(sc.nextInt());
		position.add(xy);
		}

		int result = n-1;

		for(int i=0;i<position.size();i++){
			List<Integer> rootXY = position.get(i);
			int rootX = rootXY.get(0);
			int rootY = rootXY.get(1);
				// System.out.println("rootX "+rootX);
				// System.out.println("rootY "+rootY);
			for(int j =i+1;j<position.size();j++){
				List<Integer> vectorXY = position.get(j);
				int p = vectorXY.get(0) -rootX;
				int q = vectorXY.get(1) -rootY;
				// System.out.println("p "+p);
				// System.out.println("q "+q);

				int currentResult = 1;
				for(int k=0; k<position.size();k++){
					if(k==i || k== j){
						continue;
					}
					List<Integer> calcXY = position.get(k);
					int diffX = calcXY.get(0) - rootX;
					int diffY = calcXY.get(1) - rootY;
					// System.out.println("diffX "+diffX);
					// System.out.println("diffY "+diffY);
					if(p==0){
						if(diffX!=0){
							currentResult++;
						}
						continue;
					}
					if(q==0){
						if(diffY!=0){
							currentResult++;
						}
						continue;
					}
					if(diffX%p ==0 && diffY%q==0){
						if(diffX/p == diffY/q){
							// これは0になる…はず…

						}else{
							currentResult++;							
						}
					}else{
						currentResult++;
					}
				}
				// System.out.println("currentResult " + currentResult);
				result = Math.min(currentResult,result);
			}
		}
		System.out.println(result);
 
	}

}


