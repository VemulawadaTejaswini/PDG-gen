package ShiftOnly;
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);){
			int count = 0;
			List<Integer> list = new ArrayList<Integer>();
			int N = Integer.parseInt(scan.next());
			for(int i=0; i< N ; i++) {
				list.add(Integer.parseInt(scan.next()));
			}
			while(true) {
				for(int elm: list) {
					if(elm % 2 == 1) {
						System.out.print(count);
					}
				}
				list.stream().map(m -> m/2).collect(Collectors.toList());
				count++;
			}		
		}		
	}
}