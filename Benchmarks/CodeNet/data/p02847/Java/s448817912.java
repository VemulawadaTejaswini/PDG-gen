import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s =scan.next();
		String week[]= {"SAT","FRI","THU","WED","TUE","MON","SUN"};

		for(int i=0;i<week.length;i++) {
			if(week[i].equals(s)) {
				System.out.println((i+1));
				break;
			}
		}
	}

}