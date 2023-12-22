import java.util.Scanner;

class Watch {
	private int _sec;
	
	public Watch() {
		_sec = 0;
	}
	
	public Watch(int sec) {
		_sec = sec;
	}
	
	public String getTime() {
		int h = getHour();
		_sec -= h * 3600;
		int m = getMinute();
		_sec -= m * 60;
		int s = _sec;
		return h + ":" + m + ":" + s;
	}
	private int getHour() {
		
		return _sec / 3600;
	}
	public int getMinute() {
		return _sec / 60;
	}
	
}
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(new Watch(scan.nextInt()).getTime());
	}

}

