import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)) {
			int CARD_SIZE, GATE_SIZE, ans = 0, first = 1, end;
			CARD_SIZE = sc.nextInt();
			GATE_SIZE = sc.nextInt();
			end = CARD_SIZE;
			List<Integer> commonKeys = new ArrayList<>();
			
			for (int gateNum = 0; gateNum <= GATE_SIZE; gateNum++) {
				if (gateNum == 0) {
					for (int i = first; i <= end; i++ ) {
						commonKeys.add(i);
					}
				} else {
					
					first = sc.nextInt();
					end = sc.nextInt();
					List<Integer> tmpCommonKeys = new ArrayList<>();
					for (int preCommonKeyID : commonKeys) {
						if (first <= preCommonKeyID && preCommonKeyID <= end) {
							tmpCommonKeys.add(preCommonKeyID);
						} 
					}
					commonKeys = tmpCommonKeys;
				}
				
			}
			
			
			System.out.println(commonKeys.size());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
