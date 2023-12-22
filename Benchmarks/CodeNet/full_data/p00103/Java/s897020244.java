import java.util.Scanner;

public class Main {
	private byte[] runner;
	private static final int OUT_COUNT_FOR_CHANGE = 3;
	enum EVENT {HIT, HOMERUN, OUT};
	
	private byte out;
	private int scoreOfInning;
	
	public Main {
		this.runner = new byte[3];
		this.out = 0;
		this.scoreOfInning = 0;
	}
	
	public boolean action(EVENT e) {
		boolean isChange = false;
		
		switch(e) {
		case HIT:
			scoreOfInning += hit();
			break;
		case HOMERUN:
			scoreOfInning += homerun();
			break;
		case OUT:
			isChange = out();
			break;
		default:
			break;
		}
		return isChange;
	}
	
	private int hit() {
		int ret = runner[2]==1 ? 1 : 0;
		
		runner[2] = runner[1];
		runner[1] = runner[0];
		runner[0] = 1;
		
		return ret;
	}
	
	private boolean out() {
		out++;
		if(out==OUT_COUNT_FOR_CHANGE) {
			System.out.println(scoreOfInning);
			out = 0;
			scoreOfInning = 0;
			clearRunner();
			return true;
		}
		return false;
	}
	
	private int homerun() {
		int ret = runner[0] + runner[1] + runner[2] + 1;
		
		clearRunner();
		return ret;
	}
	
	private void clearRunner() {
		runner[0] = runner[1] = runner[2] = 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Main sim = new Main();
		
		int numOfDataSet = in.nextInt();
		EVENT e = EVENT.HIT;
		for(int i=0; i<numOfDataSet; i++) {
			do {
				String event = in.next();
				
				if(event.equals("HIT")) e = EVENT.HIT;
				else if(event.equals("HOMERUN")) e = EVENT.HOMERUN;
				else if(event.equals("OUT")) e = EVENT.OUT;
				else System.exit(1);
				
			} while(!sim.action(e));
		}
	}

}