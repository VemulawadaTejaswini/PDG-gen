import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int S = sc.nextInt();
		Time t = new Time(S);
		System.out.println(t);
	
	}
	
	
	static class Time{
		int h, m, s, allTime;
		Time(int temp){
			this.allTime = temp;
		}
		public String toString(){
			h = allTime/3600;
			m = (allTime - h * 3600) / 60;
			s = allTime - (3600 * h + m * 60);
			return h + ":" + m + ":" + s; 
		}
	}

}