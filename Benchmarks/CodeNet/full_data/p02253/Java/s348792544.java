import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		
		Activity[] acts = new Activity[n];
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			
			int start = Integer.parseInt(tmpArray[0]);
			int end = Integer.parseInt(tmpArray[1]);
			
			acts[i] = new Activity(start, end);
		}
		
		Arrays.sort(acts);
		
		int count = 1;
		int currentTime = acts[0].end;
		
		for(int i = 1; i < n ; i++){
			if(currentTime < acts[i].start){
				count++;
				currentTime = acts[i].end;
			}
		}
		
		System.out.println(count);
	}

}

class Activity implements Comparable<Activity>{
	int start;
	int end;
	
	public Activity(int s, int e){
		this.start = s;
		this.end = e;
	}

	@Override
	public int compareTo(Activity a1) {
		return this.end - a1.end;
	}
	
}

