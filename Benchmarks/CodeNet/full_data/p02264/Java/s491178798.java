import java.util.Scanner;
import java.util.LinkedList;

public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int timeRestriction = in.nextInt();
		int currentTime = 0;
		LinkedList<RRSHelper> schedule = new LinkedList<RRSHelper>();
		for(int i = 0; i < num; i++) {
			schedule.add(new RRSHelper(in.next(), in.nextInt()));
		}
		in.close();
		RRSHelper temp = new RRSHelper();
		while(!schedule.isEmpty()) {
			if(schedule.peek().timeCheck() <= timeRestriction) {
				temp = schedule.remove();
				currentTime = currentTime + temp.timeCheck();
				temp.setTime(currentTime);
				System.out.println(temp);
			} else {
				temp = schedule.remove();
				currentTime = currentTime + timeRestriction;
				temp.subTime(timeRestriction);
				schedule.add(temp);
			}
		}
	}
}

class RRSHelper {
	String name;
	int timeleft;
	public RRSHelper(String x, int y) {
		name = x;
		timeleft = y;
	}
	public RRSHelper() {
	}
	
	public void addTime(int x) {
		timeleft = timeleft + x;
	}
	public void subTime(int x) {
		timeleft = timeleft - x;
	}
	public void setTime(int x) {
		timeleft = x;
	}
	public int timeCheck() {
		return timeleft;
	}
	public String toString() {
		return name + " " + timeleft;
	}
	
}
