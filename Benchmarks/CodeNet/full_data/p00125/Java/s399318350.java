//Volume1-0125
import java.util.Calendar;
import java.util.Scanner;

class Main {

	public static void main(String[] arg){

		int      y1,m1,d1,y2,m2,d2;
		long     date;
		Calendar date_01 = Calendar.getInstance(),
				 date_02 = Calendar.getInstance();

		Scanner sc = new Scanner(System.in);

		while(true){
			y1 = sc.nextInt();  m1 = sc.nextInt();  d1 = sc.nextInt();
			y2 = sc.nextInt();  m2 = sc.nextInt();  d2 = sc.nextInt();
			if(y1<0||m1<0||d1<0||y2<0||m2<0||d2<0){break;}

			date_01.set(y1,m1,d1);
			date_02.set(y2,m2,d2);
			date = (date_02.getTimeInMillis() - date_01.getTimeInMillis())/(24 * 60 * 60 * 1000 );
			System.out.println(date);
		}
	}
}