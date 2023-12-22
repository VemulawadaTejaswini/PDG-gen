import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//入力値を格納
		int n = Integer.parseInt(sc.next());
		List<Double> aList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			aList.add(Double.parseDouble(sc.next()));
		}
		
		//組み合わせ計算 貪欲
		int result = 0;
		for(int i = 0; i<aList.size(); i++) {
			BigDecimal ai = BigDecimal.valueOf(aList.get(i));
			for(int j = i +1; j<aList.size(); j++) {
				BigDecimal aj = BigDecimal.valueOf(aList.get(j));
				BigDecimal aiaj = ai.multiply(aj);
				try {
					double aiajDouble = aiaj.intValueExact();
					if ((aiajDouble == Math.floor(aiajDouble))) {
					result++;
				}
				} catch (Exception e) {
					//ロスト
				}
			}
		}
		System.out.println(result);
	}
	
}