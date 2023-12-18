import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt();
		int fr = all/100, ba = all-(fr*100);
		if(0<fr&&fr<=12) { 
			if(0<ba&&ba<=12)System.out.println("AMBIGUOUS");
			else if(ba <= 0) System.out.println("NA");
			else System.out.println("MMYY");
		}else if(fr>12){
			if(0<ba&&ba<=12) System.out.println("YYMM");
			else System.out.println("NA");
		}else {
			System.out.println("NA");
		}
	}
}