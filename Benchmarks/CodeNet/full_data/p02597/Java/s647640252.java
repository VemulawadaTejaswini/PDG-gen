import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String colors = sc.next();
		String[] colorArray = colors.split("");
		List<String> stoneColorList = new ArrayList<>();
		for (int i = 0; i<n; i++) {
			//W or R
			stoneColorList.add(colorArray[i]);
		}
		
		boolean b = true;
		int result = 0;
		while(b) {
			List<String> subListA = stoneColorList.subList(0, n/2);
			List<String> subListB = stoneColorList.subList(n/2, n);
			//左側にWがいくつある
			int subA = culcColor(subListA,"W");
			//左側にRがいくつある
			int subB = culcColor(subListB,"R");
			if (subB != 0) {
				result += subA;
			}
			if (subA<subB) {
				stoneColorList = subListB;
				n = n/2;
			} else {
				b = false;
			}
			
		}
		System.out.println(result);
		
		
	}
	
	private static int culcColor(List<String> list, String col) {
		int result = 0;
		for (String color : list) {
			if (col.equals(color)) {
				result++;
			}
		}
		return result;
	}
}
