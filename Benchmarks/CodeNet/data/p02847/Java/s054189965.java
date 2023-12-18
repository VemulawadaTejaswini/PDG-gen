import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        if (date.equals("SUN")) {
            System.out.println(7);
        } else if (date.equals("MON")) {
            System.out.println(6);
        } else if (date.equals("TUE")) {
            System.out.println(5);
        } else if (date.equals("WED")) {
            System.out.println(4);
        } else if (date.equals("THU")) {
            System.out.println(3);
        } else if (date.equals("FRI")) {
            System.out.println(2);
        } else if (date.equals("SAT")) {
            System.out.println(1);
        }
	}
}
