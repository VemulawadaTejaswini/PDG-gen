import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 1;
		int d = 1;
		while(m!=0&&d!=0){
			m=sc.nextInt();
			d=sc.nextInt();
			double i = ((26*(m+1)/10)+d+111)%7;
			switch((int)i){
				case 0: System.out.println("Saturday");break;
				case 1: System.out.println("Sunday");break;
				case 2: System.out.println("Monday");break;
				case 3: System.out.println("Tuesday");break;
				case 4: System.out.println("Wednesday");break;
				case 5: System.out.println("Thursday");break;
				case 6: System.out.println("Friday");break;
			}
		}
	}
}