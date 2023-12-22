import java. util.Scanner;
public class  Main{
	Scanner sc=new Scanner(System.in);
	int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
	int day;
	
	void a(){
		while(true){
			int m=sc.nextInt();
			day=sc.nextInt();
			String y="";
			if(m==0)break;
			for(int i=0; i<m-1; i++)day+=month[i];
			m=(day)%7;
			switch(m){
				case 0:
					y= "Wednesday";
					break;
				case 1:
					y= "Thursday";
					break;
				case 2:
					y= "Friday";
					break;
				case 3:
					y= "Saturday";
					break;
				case 4:
					y="Sunday";
					break;
				case 5:
					y="Monday";
					break;
				case 6:
					y="Tuesday";
					break;
			}
			System.out.println(y);
		}
	}
	
	public static void main(String[]agrs){
		new Main().a();
	}
}