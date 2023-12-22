import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*   重複も消す
		Scanner stdIn = new Scanner(System.in);
		TreeSet<Long> list = new TreeSet<Long>();
		
		int numS = stdIn.nextInt();	    //集合Sの読み込み
		for(int r = 0; r < numS; r++) {
			long input = stdIn.nextLong();
			list.add(input);
		}
		
		int numT = stdIn.nextInt();     //集合Tの読み込み
		int count = 0;
		for(int r = 0; r < numT; r++) {
			long input = stdIn.nextLong();
			if(list.contains(input)) {
				count++;
			}
		}
		
		System.out.println(count);
		*/
		Scanner stdIn = new Scanner(System.in);
		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		
		int numS = stdIn.nextInt();
		for(int r = 0; r < numS; r++) {
			long input = stdIn.nextLong();
			hm.put(input, 1);
		}
		
		int numT = stdIn.nextInt();
		int count = 0;
		for(int r = 0; r < numT; r++) {
			long input = stdIn.nextLong();
			if(hm.containsKey(input))
				count += hm.get(input);
		}
		System.out.println(count);
	}
}