import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int second = sc.nextInt();
		
		int minute = second/60;
		second = second%60;
		
		int hour = minute/60;
		minute = minute%60;
		
		System.out.println(hour + ":" + minute + ":" + second);
	}
}