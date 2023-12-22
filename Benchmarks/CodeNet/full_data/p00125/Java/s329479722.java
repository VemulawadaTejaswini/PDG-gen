import java.util.Scanner;

class Main{
	public static void main(String[] args){

		int[] dayday = new int[6];
		int di;
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		
		while(true){
			di = 0;
			for(int i = 0; i < 6; i++){
				dayday[i] = input.nextInt();
				if (dayday[i] < 0){
					flag = true;
				}
			}
			if(flag) break;
			
			Day day = new Day(dayday[0], dayday[1], dayday[2]);
			day.Day2(dayday[3], dayday[4], dayday[5]);
			
			di += day.year_d();
			di += day.month_d();
			di += day.d_d();
			System.out.println(di);
		}
	}
}

class Day{
	private int year;
	private int month;
	private int date;
	private int year2;
	private int month2;
	private int date2;
	private int uru  = 0;
	
	public Day(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public void Day2(int year, int month, int date){
		this.year2 = year;
		this.month2 = month;
		this.date2 = date;
	}
	public void printday(){
		System.out.println("year = " + this.year);
		System.out.println("month = " + this.month);
		System.out.println("date = " + this.date);
		System.out.println("year2 = " + this.year2);
		System.out.println("month2 = " + this.month2);
		System.out.println("date2 = " + this.date2);
	}
	public int year_d(){
		for (int i = this.year; i < this.year2; i++){
			if (i%4 == 0 && !(i%100 == 0) || i%400 == 0){
				this.uru++;
			}
		}
		return (this.year2 - this.year) * 365 + uru;
	}
	public int month_d(){
		int sum = 0;
		for (int i = this.month; i < this.month2; i++){
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
				sum += 31;
			}
			else{
				sum += 30;
			}
		}
		
		return sum;
	}
	
	public int d_d(){
		this.date2 -= this.date;
		if (this.date2 < 0){
			date2 = 30 - this.date;
		}
		
		return date2;
	}
}