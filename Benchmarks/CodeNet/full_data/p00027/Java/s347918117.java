import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = null;
		int[] Month ={31,29,31,30,31,30,31,31,30,31,30};
		String[] Week={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		try{
			scan = new Scanner(System.in);
			while(scan.hasNext()){
				int sum_day = 2;
				int month = scan.nextInt();
				int day = scan.nextInt();
				if(month == 0 && day ==0)break;
				for(int i = 0; i < month;i++){
					sum_day += Month[i];
				}
				sum_day += day;
				sum_day %=7;
				System.out.println(Week[sum_day]);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}