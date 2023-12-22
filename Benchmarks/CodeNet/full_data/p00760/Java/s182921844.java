import java.util.Scanner;


public class Main {
	public final static int celebrateYear = 1000;
	public final int celebrateMonth = 1;
	public final int celebrateDay = 1;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			int ret = countDay(year,month,day);
			System.out.println(ret+1);
		}
	}
	
	public static int countDay(int year,int month,int day){
		int r = 0;
		for(int i= year+1; i <celebrateYear; i++){
			if(lsBigYear(i) == false){
				for(int j = 1; j <= 10; j++){
					if(j % 2 == 0)r += 19;
					else r += 20;
				}
			}
			else{
				for(int j = 1; j <= 10; j++){
					r += 20;
				}
			}
		}
		r += countDayInFirstYear(year,month,day);
		return r;
	}
	
	public static int countDayInFirstYear(int year,int month,int day)
	{
		int r = 0;
		if(lsBigYear(year) == true){
			r = 20 - day;
			for(int i = month + 1; i <= 10; i++){
				r += 20;
			}
		}else{
			if(month % 2 == 0)r += 19 - day;
			else r += 20 - day;
			for(int i = month + 1; i <= 10; i++){
				if(i % 2 == 0) r += 19;
				else r += 20;
			}
		}
		return r;
	}
	public static boolean lsBigYear(int year){
		if(year % 3 == 0) return true;
		else return false;
	}
}