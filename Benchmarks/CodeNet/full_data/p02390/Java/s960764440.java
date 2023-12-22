import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String indata = s.next();
		int data = Integer.parseInt(indata);
		int sec = data%60;
		int min = data%3600/60;
		int hour = data/3600;
		System.out.println(hour+":"+min+":"+sec);
	}
}