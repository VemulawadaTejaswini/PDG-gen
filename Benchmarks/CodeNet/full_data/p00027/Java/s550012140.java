import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Calendarテ」ツつッテ」ツδゥテ」ツつケテ」ツ?ョテ」ツつェテ」ツδ姪」ツつクテ」ツつァテ」ツつッテ」ツδ?al1テ」ツつ津ァツ板淌ヲツ按静」ツ?療」ツ?ヲテ」ツ??」ツ?セテ」ツ?凖」ツ??
		Calendar cal1 = Calendar.getInstance();
		Scanner aScanner = new Scanner(System.in);
		while(aScanner.hasNextInt()){
			//setテ」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツ?ァテヲツ猟・テヲツ卍づ」ツ?ォ2100テ・ツケツエ3テヲツ慊?テヲツ猟・テ」ツつ津ィツィツュテ・ツョツ堙」ツ?療」ツ?ヲテ」ツ??」ツ?セテ」ツ?凖」ツ??
			int month = aScanner.nextInt() - 1;
			int date = aScanner.nextInt();
			if(month < 0 && date ==  0){break;}
			cal1.set(2004, month, date);
			//               
			switch (cal1.get(Calendar.DAY_OF_WEEK)){

				// テ・ツ渉姪・ツセツ療」ツ?療」ツ?淌ヲツ崢愿ヲツ猟・テ」ツδ陛」ツつ」テ」ツδシテ」ツδォテ」ツδ嘉」ツ?ョテ・ツ?、テ」ツ?ィテ・ツ青?ヲツ崢愿ヲツ猟・テ」ツつ津ィツ。ツィテ」ツ?凖・ツ?、テ」ツつ津ヲツッツ氾ィツシツε」ツ?療」ツ?ヲテヲツ崢愿ヲツ猟・テ」ツつ津・ツセツ療」ツ?セテ」ツ?凖」ツ??
				case Calendar.SUNDAY:
					System.out.println("Sunday");
					break;
				case Calendar.MONDAY:
					System.out.println("Moday");
					break;
				case Calendar.TUESDAY:
					System.out.println("Saturday");
					break;
				case Calendar.WEDNESDAY:
					System.out.println("Wednesday");
					break;
				case Calendar.THURSDAY:
					System.out.println("Thursday");
					break;
				case Calendar.FRIDAY:
					System.out.println("Friday");
					break;
				case Calendar.SATURDAY:
					System.out.println("Saturday");
					break;
			}
		}
	}
}