import java.util.*;

enum NoOfDaysTillSunday
{
	SUN(7),
	MON(6),
	TUE(5),
	WED(4),
	THU(3),
	FRI(2),
	SAT(1);
		
	int numberOfDaysTillSunday;
	NoOfDaysTillSunday(int numberOfDaysTillSunday) {this.numberOfDaysTillSunday = numberOfDaysTillSunday;};
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		// get day of week		
		String day = sc.next();
		System.out.println(NoOfDaysTillSunday.valueOf(day).numberOfDaysTillSunday);	
	}
}
