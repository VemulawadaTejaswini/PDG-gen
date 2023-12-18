import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer town = sc.nextInt();
		Long teleport = sc.nextLong();
 
		List<Integer> lists = new ArrayList<Integer>(town);
		for(int i = 0; i < town; i ++) {
			lists.add(sc.nextInt() - 1);
		}
 
		List<Integer> teleLists = new ArrayList<Integer>(town);
		Integer nowTown = 0;
		Integer nextTown = 0;
		teleLists.add(0);
		while(true) {
			nextTown = lists.get(nowTown);
			if(teleLists.contains(nextTown)) {
				break;
			}
			teleLists.add(nextTown);
			nowTown = nextTown;
		}
 
		Integer roopStart = teleLists.indexOf(nextTown);
		Long num1 = teleport - roopStart;
		
		Integer roopRemain = (int) (num1 % (teleLists.size() - roopStart));
		Integer result = teleLists.get(roopStart + roopRemain) + 1;
		
		System.out.println(result);
	}
}