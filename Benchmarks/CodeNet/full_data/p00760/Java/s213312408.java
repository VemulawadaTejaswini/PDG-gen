import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		
			int value = sc.nextInt();
			if(value != 0){
				calc(value);
			}
		
	}
	public void calc(int n){
		int usual = 20 * 5 + 19 * 5;
		int notUsual = 20 * 10;
		int alldays = getDays(1000);
		
		for(int i = 0; i < n; i++){
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			int days = getThisYearDays(year, month, day);
			
			System.out.println(alldays - days + 1);
		}
	}
	public int getThisYearDays(int year, int month, int day){
		int m = month - 1;
		int ans = getDays(year);
		if(year % 3 == 0){
			ans = ans + m * 20 + day;
		}
		else{
			if(m % 2 == 0){
				ans = ans + (m/2) * 20 + (m/2) * 19 + day;
			}
			else{
				ans = ans + (m/2) * 20 + (m/2) * 19 + 20 + day;
			}
		}
		return ans;
	}
	public int getDays(int year){
		int usual = 20 * 5 + 19 * 5;
		int notUsual = 20 * 10;
		
		year = year - 1;
		int years = year / 3;
		int amari = year % 3;
		
		int d = (usual + usual + notUsual) * years;
		if(amari == 1){
			d = d + usual;
		}
		else if (amari == 2){
			d = d + usual + usual;
		}
		return d;
	}
	public static void main(String[] args){
		new Main().run();
	}
}