import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time[][] TimeArray = new Time[3][8];
		Time[] ThirdTimeArray = new Time[6];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 8; j++){
				TimeArray[i][j] = new Time(sc.nextInt(), sc.next());
			}
		}
		for(int i = 0; i < 3; i++){
			Arrays.sort(TimeArray[i]);
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				System.out.println(TimeArray[i][j]);
			}
		}
		int tta = 0;
		int ta = 0;
		while(tta < 6){
			ThirdTimeArray[tta] = TimeArray[ta][2];
			ThirdTimeArray[tta + 1] = TimeArray[ta][3];
			tta += 2;
			ta++;
		}
		Arrays.sort(ThirdTimeArray);
		System.out.println(ThirdTimeArray[0]);
		System.out.println(ThirdTimeArray[1]);
	}
}

class Time implements Comparable<Time>{
	int id;
	String time;
	Time(int id, String time){
		this.id = id;
		this.time = time;
	}
	@Override
	public String toString(){
		return id + " " + time;
	}
	@Override
	public int compareTo(Time t){
		return time.compareTo(t.time);
	}
}