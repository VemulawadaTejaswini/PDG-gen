import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        String date = sc.next();
        int date1 = Integer.parseInt(date.substring(0, 2));
        int date2 = Integer.parseInt(date.substring(2, 4));

        int yymm = 0;
        int mmyy = 0;

        if (date2 != 0 && date2 < 13) {
            yymm = 1;
        }
        if (date1 != 0 && date1 < 13) {
            mmyy = 1;
        }

        if (yymm == 1 && mmyy == 1) {
            System.out.println("AMBIGUOUS");
        } else if (yymm == 0 && mmyy == 0) {
            System.out.println("NA");
        } else if (yymm == 1) {
            System.out.println("YYMM");
        } else {
            System.out.println("MMYY");
        }
	}
}