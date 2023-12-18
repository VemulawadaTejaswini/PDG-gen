
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {


	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Robot> robotsByL = new TreeSet<>(Comparator.comparing((Robot robot)->robot.l));
		TreeMap<Integer, Integer> ans = new TreeMap<>();
		TreeMap<Integer, Integer> ansRev = new TreeMap<>();
		for (int i=0;i<n;i++ ) {
			Robot robot = new Robot();
			int x=sc.nextInt();
			int len=sc.nextInt();
			int l=x-len;
			int r=x+len;
			robot.l=l;
			robot.r=r;
			robotsByL.add(robot);
		}
		for (Robot robot : robotsByL) {
			if (ans.floorEntry(robot.l)==null) {
				ans.put(robot.r, 1);
				ansRev.put(1, robot.r);
			} else {
				int current = ans.floorEntry(robot.l).getValue();
				if (ansRev.get(current+1)==null || ansRev.get(current+1) > robot.r) {
					if (ansRev.get(current+1)!=null) {
						ans.remove(ansRev.get(current+1));
					}
					ans.put(robot.r, current+1);
					ansRev.put(current+1, robot.r);
				}
			}
		}
		
		
		System.out.println(ansRev.lastKey());
	}
	
	
}
class Robot {
	int l;
	int r;
}
