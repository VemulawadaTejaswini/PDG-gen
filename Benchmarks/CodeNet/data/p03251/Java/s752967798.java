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

		if(listX.get(n-1)<listY.get(0)){
		System.out.println("No War");
		}else{
		System.out.println("War");
		}



	}
}