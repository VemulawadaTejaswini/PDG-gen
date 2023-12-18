import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S =sc.nextLine();
		int[] form = new int[3];
		form[0] =Integer.parseInt(S.substring(0, 2));
		form[1] =Integer.parseInt(S.substring(2, 4));
		if(form[0] > 0 && form[0] < 13){
			yearSurv(form[1]);
		}
		else if(form[0] >= 13 && form[0] < 100){
			monthSurv(form[1]);
		}
		else if(form[0] == 0){
			monthSurv(form[1]);
		}
		else{
			System.out.println("NA");
		}
	}
	
	public static void yearSurv(int year){
		if(year > 0 && year <13 ){
			System.out.println("AMBIGUOUS");
		}
		else if(year >= 13 && year <100){
			System.out.println("MMYY");
		}
		else if(year == 0){
			System.out.println("MMYY");
		}
		else{
			System.out.println("NA");
		}
	}
	
	public static void monthSurv(int month){
		if(month > 0 && month < 13){
			System.out.println("YYMM");
		}
		else{
			System.out.println("NA");
		}
	}
}

