import java.util.*;
public class Main {
	static String[] Day=new String[10];
	public static void setDay(){
		Day[0]="Wednesday";
		Day[1]="Thursday";
		Day[2]="Friday";
		Day[3]="Saturday";
		Day[4]="Sunday";
		Day[5]="Monday";
		Day[6]="Tuesday";
	}
	static int[] Month=new int[20];
	public static void setMonth(){
		Month[1]=31;
		Month[2]=29;
		Month[3]=31;
		Month[4]=30;
		Month[5]=31;
		Month[6]=30;
		Month[7]=31;
		Month[8]=31;
		Month[9]=10;
		Month[10]=31;
		Month[11]=30;
		Month[12]=31;
	}
	public static void main(String args[]){
		setDay();
		setMonth();
		Scanner in=new Scanner(System.in);
		int date,month,days;
		while(in.hasNextInt()){
			month=in.nextInt();
			date=in.nextInt();
			if(month==0&&date==0)
				break;
			days=0;
			for(int i=1;i<month;i++)
				days+=Month[i];
			days+=date;
			System.out.println(Day[days%7]);
		}
		in.close();
	}
}