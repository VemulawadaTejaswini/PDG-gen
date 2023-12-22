import java.util.*;
public class Main {
	int i,runner;
	String time;
	Runner timeArray[] = new Runner[24];
	int flag[] = new int[timeArray.length];
	Runner subArray[] = new Runner[timeArray.length];
	
	void doIt(){
		Scanner sc = new Scanner(System.in);
		for(i = 0; i < timeArray.length; i ++ ){
			runner = sc.nextInt();
			time = sc.next();
			timeArray[i] = new Runner(runner,time);
		}
		for(i = 0; i < 3; i ++ ){
			Arrays.sort(timeArray,i * 8,i * 8 + 8);
			System.out.println(timeArray[i * 8].runner+" "+timeArray[i * 8].time);
			System.out.println(timeArray[i * 8 + 1].runner+" "+timeArray[i * 8 + 1].time);
			flag[i * 8] = 1;
			flag[i * 8 + 1] = 1;
		}
		subArray = timeArray.clone();
		for(i = 0; i < subArray.length; i ++ ){
			if(flag[i] == 1){
				subArray[i].time = String.valueOf(Integer.MAX_VALUE);
				System.out.println(subArray[i].time);
			}
		}
		Arrays.sort(subArray);
		System.out.println(subArray[0].runner+" "+subArray[0].time);
		System.out.println(subArray[1].runner+" "+subArray[1].time);
	}
	
	class Runner implements Comparable<Runner>{
		int runner;
		String time;
		Runner(int runner,String time){
			this.runner = runner;
			this.time = time;
		}
		@Override
		public int compareTo(Runner r){
			return time.compareTo(r.time);
		}
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}