import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			TrainEvent[] events = new TrainEvent[2*n];
			
			for(int i = 0; i < events.length; i+=2){
				String[] tmpArray = br.readLine().split(" ");

				events[i] = new TrainEvent(tmpArray[0], TrainEvent.DEPART);
				events[i + 1] = new TrainEvent(tmpArray[1], TrainEvent.ARRIVE);
				
			}
			
			System.out.println(solve(events));
			
		}
	}
	
	static int solve(TrainEvent[] events){
		
		int result = 0;
		Arrays.sort(events);
		
		int running = 0;
		//debug
		for(int i = 0; i < events.length ; i++){
			//System.out.println(events[i].time);
			if(events[i].type == TrainEvent.DEPART){
				running++;
				result = Math.max(running, result);
			}
			else {
				running--;
			}
		}
		
		return result;
	}

}

class TrainEvent implements Comparable<TrainEvent>{
	String time;
	int type;
	static final int DEPART = 1;
	static final int ARRIVE = 0;
	
	public TrainEvent(String time, int type){
		this.time = time;
		this.type = type;
	}

	@Override
	public int compareTo(TrainEvent event) {
		// TODO Auto-generated method stub
		return time.equals(event.time) ? this.type - event.type : time.compareTo(event.time);
	}
}

