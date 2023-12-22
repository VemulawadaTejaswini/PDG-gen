import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate ld = LocalDate.of(2017, 9, sc.nextInt());

			switch(ld.getDayOfWeek()) {
			case FRIDAY:
				System.out.println("fri");
				break;
			case MONDAY:
				System.out.println("mon");
				break;
			case SATURDAY:
				System.out.println("sat");
				break;
			case SUNDAY:
				System.out.println("sun");
				break;
			case THURSDAY:
				System.out.println("thu");
				break;
			case TUESDAY:
				System.out.println("tue");
				break;
			case WEDNESDAY:
				System.out.println("wed");
				break;
			default:
				break;

			}

		sc.close();
	}

}
