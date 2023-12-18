import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Comparable<Main>{
	private int deadline;
	private int takes;
	
	Main(String in) {
		String[] t = in.split(" ");
		deadline = Integer.parseInt(t[1]);
		takes = Integer.parseInt(t[0]);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    List<Main> task = new ArrayList<>();
	    String kizahashiSay = "Yes";
	    int num = Integer.parseInt(in.nextLine());
	    for (int i = 0; i < num; i++) {
	      task.add(new Main(in.nextLine()));
	    }
	    in.close();
	    task.sort((e, o) -> e.compareTo(o));
	    long surplusTime = 0;
	    int nowTime = 0;
	    long elapsedTime = 0;
	    for (Main e : task) {
	    	elapsedTime = e.deadline() - nowTime;
	    	nowTime = e.deadline();
	    	surplusTime += elapsedTime - e.cost();
	    	if (surplusTime < 0) {
	    		kizahashiSay = "No";
	    		break;
	    	}
	    }
	    System.out.println(kizahashiSay);
	}

	@Override
	public int compareTo(Main o) {
		Main other = (Main) o;
		return this.deadline - other.deadline();
	}
	
	public int deadline() {
		return this.deadline;
	}
	public int cost() {
		return this.takes;
	}
	
}
