import java.util.*;
public class Main {
	public static int process(int k) {
		if(k >= 400 && k < 600) {
			return 8;
		}
		else if(k >= 600 && k < 800) {
			return 7;
		}
		else if(k >= 800 && k < 1000) {
			return 6;
		}
		else if(k >= 1000 && k < 1200) {
			return 5;
		}
		else if(k >= 1200 && k < 1400) {
			return 4;
		}
		else if(k >= 1400 && k < 1600) {
			return 3;
		}
		else if(k >= 1600 && k < 1800) {
			return 2;
		}
		else if(k >= 1800 && k < 2000) {
			return 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println(process(t));
	}
}