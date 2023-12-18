import java.util.*;

public class Main {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);){
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<5; i++) {
				list.add(Integer.parseInt(scan.next()));
			}
			int k = Integer.parseInt(scan.next());
			List<Integer> revList = new ArrayList<Integer>(list);
			for(Integer num:list) {
				for(Integer rev: revList) {
					if(rev - num > k) {
                      	System.out.println(":(");
						System.exit(0);
					}
				}
			}
          	System.out.println("Yay!");	
		}
	}
}