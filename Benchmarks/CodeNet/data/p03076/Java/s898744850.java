import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> timeList = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			timeList.add(sc.nextInt());
		}
		
		List<Integer> onesPlaceList = new ArrayList<>();
		for(Integer time : timeList) {
			onesPlaceList.add(time.intValue() % 10);
		}
		
		int sumTime = timeList.stream().mapToInt(time -> time).sum();
		int waitingTime = onesPlaceList.stream().filter(onesPlace -> onesPlace != 0).mapToInt(onesPlace -> 10 - onesPlace).sum();
		Optional<Integer> last = onesPlaceList.stream().filter(onesPlace -> onesPlace != 0).min(Comparator.naturalOrder());
		int minusTime = last.get() == null ? 0 : 10 - last.get();
		System.out.print(sumTime + waitingTime - minusTime);
	}	
}