import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		List<Integer> listX = new ArrayList<>();
		List<Integer> listY = new ArrayList<>();
		for(int i=0;i<n;i++){
			listX.add(sc.nextInt());
		}
		for(int i=0;i<m;i++){
			listY.add(sc.nextInt());
		}

		Collections.sort(listX);

		Collections.sort(listY);
		
		// System.out.println(listX.get(n-1));
		// System.out.println(listY.get(0));

		if(listX.get(n-1)<listY.get(0)){
			if(listY.get(0) > x && listX.get(n-1) < y ){
				System.out.println("No War");
			}else{
				System.out.println("War");
			}
		}else{
			System.out.println("War");
		}



	}
}