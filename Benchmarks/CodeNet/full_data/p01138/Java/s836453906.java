import java.util.ArrayList;
import java.util.Scanner;


class Train{
	int start, end;
	
	public Train(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	boolean canRun(int start){
		return start >= this.end;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in).useDelimiter("[:\\s]");

		int n;
		
		while((n=sn.nextInt()) != 0){
			ArrayList<Train> trains = new ArrayList<Train>();
			
			for(int i = 0; i < n; i++){
				int start = toSec(sn.nextInt(), sn.nextInt(), sn.nextInt());
				int end = toSec(sn.nextInt(), sn.nextInt(), sn.nextInt());
				boolean run = false;
				if(start-end == 0) break;
				for(int j = 0; j < trains.size(); j++){
					if(trains.get(j).canRun(start)){
						run = true;
						trains.set(j, new Train(start, end));
						break;
					}
				}
				if(!run){
					trains.add(new Train(start, end));
				}
			}
			System.out.println(trains.size());
			trains.clear();
			
		}
	}
	static int toSec(int h, int m, int s){
		return h*3600+m*60+s;
	}
}