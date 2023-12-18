import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int touristAttractionsNum = sc.nextInt();

		
		String point = "";
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < touristAttractionsNum; i++) {
			map.put(i, sc.nextInt());
		}
		
		for(int i = 0; i < touristAttractionsNum; i++) {
			int currentPoint = 0;
			int price = 0;
			for(int k = 0;k < map.size(); k++) {
				if(i != k) {
					int kankoPoint = map.get(k);
					int tmpPrice = currentPoint - kankoPoint;
					if(tmpPrice < 0) {
						tmpPrice = tmpPrice * -1;
					}
					currentPoint = kankoPoint;
					price += tmpPrice;
				}
				
			}
			
			if(currentPoint < 0) {
				price += currentPoint * -1;
			} else {
				price += currentPoint;
			}
			System.out.println(price);
		}
	}
}