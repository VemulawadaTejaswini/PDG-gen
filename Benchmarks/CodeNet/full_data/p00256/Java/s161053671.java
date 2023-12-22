import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
	
	public static void print_Gre(long sum){
		
	    final long K = (sum + 305) / 146097;
	    final long L = ((sum + 305) % 146097) / 36524;
	    final long M = (((sum + 305) % 146097) % 36524) / 1461;
	    final long N = ((((sum + 305) % 146097) % 36524) % 1461) / 365;
	    
	    long year = 400 * K + 100 * L + 4 * M + N;
	    
	    long day = sum - (365 * (year - 1) + year / 4 - year / 100 + year / 400 + 31 + 28 + 1);
	    
	    if(day == -1){
	    	year--;
	    	day = 365;
	    }
	    
	    long month;
	    for(month = 3; month < 15; month++){
	        if(306 * (month+1) / 10 - 122 <= day && 306 * (month + 2) / 10 - 122 > day)
	            break;
	    }
	    day -= 306 * (month + 1) / 10 - 122 - 1;
	    if(month > 12){
	        year++;
	        month -= 12;
	    }
	    
	    System.out.println(year+"."+month+"."+day);
	}
	
	public static void print_Maya(long sum){
		sum %= CYCLE;
		
		final long ki = sum % 20;
		sum /= 20;
		final long w = sum % 18;
		sum /= 18;
		final long t = sum % 20;
		sum /= 20;
		final long ka = sum % 20;
		sum /= 20;
		final long b = sum;
		
		System.out.println(b + "." + ka + "." + t + "." + w + "." + ki);
	}
	
	public static long Fairfileld(long year, long month, long day){
		if(month <= 2){
			month += 12;
		}
		
		return (365 * year) + (year / 4) - (year / 100) + (year / 400) + ((306 * (month + 1)) / 10) + day - 428;
	}
	
	public static long Maya(long b, long ka, long t, long w, long ki){
		return (((((((b * 20) + ka) * 20) + t) * 18) + w) * 20) +  ki;
	}
	
	public static final long CYCLE = Maya(13, 0, 0, 0, 0);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final String input = sc.next();
			
			if("#".equals(input)){
				break;
			}
			//System.out.println(input);
			String[] inputs = input.split("\\.");
			
			//boolean s_to_m = false;
			long sum = 0;
			if(inputs.length == 3){
				final int year = Integer.parseInt(inputs[0]);
				final int month = Integer.parseInt(inputs[1]);
				final int day = Integer.parseInt(inputs[2]);
				
				sum = Fairfileld(year, month, day) - Fairfileld(2012, 12, 21);
				
				print_Maya(sum);
			}else{
				
				final long b = Long.parseLong(inputs[0]);
				final long ka = Long.parseLong(inputs[1]);
				final long t = Long.parseLong(inputs[2]);
				final long w = Long.parseLong(inputs[3]);
				final long ki = Long.parseLong(inputs[4]);
				
				sum = Maya(b, ka, t, w, ki) + Fairfileld(2012, 12, 21);
				
				print_Gre(sum);
			}
			
		}
		
		sc.close();
	}
}