import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String  a = sc.next();
		
		if (a.equals("SUN")){
			System.out.print("7");
		}
		if (a.equals("MON")){
			System.out.print("6");
		}
		if (a.equals("TUE")){
			System.out.print("5");
		}
		if (a.equals("WED")){
			System.out.print("4");
		}
		if (a.equals("THU")){
			System.out.print("3");
		}
		if (a.equals("FRI")){
			System.out.print("2");
		}
		if (a.equals("SAT")){
			System.out.print("1");
		}
	}
}