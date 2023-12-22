import java.util.Scanner;

class Main {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		while (true){
			int year1, month1, date1;
			
			year1 = input.nextInt();
			if (year1 < 0)return;
			
			month1 = input.nextInt();
			if (month1 < 0)return;
			
			date1 = input.nextInt();
			if (date1 < 0)return;
			
			Day d1 = new Day(year1, month1, date1);
			
			int year2, month2, date2;
			
			year2 = input.nextInt();
			if (year2 < 0)return;
			
			month2 = input.nextInt();
			if (month2 < 0)return;
			
			date2 = input.nextInt();
			if (date2 < 0)return;
			
			Day d2 = new Day(year2, month2, date2);
			
			
			int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			int sumday = 0;
			
			int cu = 0;
			for (int i = year1; i <= year2; i++){
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0 && month1 < 3 && date2 <= 28)cu++;
				
			}
			
			sumday += (year2 - year1) * 365;
			
			for (int i = 1; i < month2 - month1; i++){
				
				sumday += md[month1 + i];
			}
			
			
			if (month1 == month2)sumday += date2 - date1;
			
			else {
				
				sumday += date2 + 1;
				
				sumday += (md[month1 - 1] - date1);
			}
			
			sumday += cu;
			
			System.out.println(sumday);
		}
		
		
	}
}
class Day {
	private int year;
	private int month;
	private int date;
	
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public Day() {}
	
	public void printDay(){
		System.out.println("year = " + this.year);
		System.out.println("month = " + this.month);
		System.out.println("date = " + this.date);
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDate(int date){
		this.date = date;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDate(){
		return date;
	}
}