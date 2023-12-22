import java.util.*;
public class Main {
	int i,runner;
	String time;
	Runner timeArray[] = new Runner[24];
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
			timeArray[i * 8].time = "hoge";
			timeArray[i * 8 + 1].time = "hoge2";
		}
		Arrays.sort(timeArray);
		System.out.println(timeArray[0].runner+" "+timeArray[0].time);
		System.out.println(timeArray[1].runner+" "+timeArray[1].time);
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