import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int count=0;
		int tens=((S/10)-((int)(S/100))*10)*10;
		int ones=S%10;
		
		if((S/100)<=12 && (S/100)!=0) {
			count+=1;
		}
		if((tens+ones)<=12 && (tens+ones)!=0) {
			count+=2;
		}
		
		
		switch(count){
		case 0:
			System.out.print("NA");
			break;
		case 2:
			System.out.print("YYMM");
			break;
		case 1:
			System.out.print("MMYY");
			break;
		case 3:
			System.out.print("AMBIGUOUS");
			break;
		}
		
		sc.close();
	}
}
