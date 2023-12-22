import java.util.Scanner;


public class Main{
	
	static final int[] days = new int[]{31, 29, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		while(true){
			int month = sc.nextInt(); if(month == 0) break;
			int day = sc.nextInt();
			System.out.println(whatDay(month, day).toString());
		}
		sc.close();
	}
	
	static int fromJanuary1(int month, int day){
		int result = 0;
		for(int i = 0; i < month - 1; i++) result += days[i];
		return result + day - 1;
	}
	
	static Days whatDay(int month, int day) {
		int fromjan1 = fromJanuary1(month, day);
		int days = fromjan1 % 7;
		if(days == 0) return Days.Thursday;
		else if(days == 1) return Days.Friday;
		else if(days == 2) return Days.Saturday;
		else if(days == 3) return Days.Sunday;
		else if(days == 4) return Days.Monday;
		else if(days == 5) return Days.Tuesday;
		else return Days.Wednesday;
	}
}

enum Days{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}