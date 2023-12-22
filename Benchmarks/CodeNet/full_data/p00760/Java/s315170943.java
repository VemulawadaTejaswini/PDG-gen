import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			int count_day = 0;
			
			if(day > 1){
				if(year % 3 == 0){
					count_day += 21 - day;
				}else{
					if(month % 2 == 0){
						count_day += 20 - day;
					}else{
						count_day += 21 - day;
					}
				}
				
				month++;
				day = 1;
				
				if(month > 10){
					month = 1;
					year++;
				}
			}
				
			while(!(year == 1000 && month == 1 && day == 1)){
				if(year % 3 == 0){
					count_day += 21 - day;
				}else{
					if(month % 2 == 0){
						count_day += 20 - day;
					}else{
						count_day += 21 - day;
					}
				}
				
				month++;
				
				if(month > 10){
					month = 1;
					year++;
				}
			}
			
			System.out.println(count_day);
			
		}
		
	}
}	