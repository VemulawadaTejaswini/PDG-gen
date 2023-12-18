import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		if(n.equals("SUN")){
			System.out.println("MON");
		}else if(n.equals("MON")){
			System.out.println("TUE");
		}else if(n.equals("TUE")){
			System.out.println("WED");
		}else if(n.equals("WED")){
			System.out.println("THU");
		}else if(n.equals("THU")){
			System.out.println("FRI");
		}else if(n.equals("FRI")){
			System.out.println("SAT");
		}else if(n.equals("SAT")){
			System.out.println("SUN");
		}
	}
}