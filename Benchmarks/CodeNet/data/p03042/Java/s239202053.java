import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt();
		int fr = all/100, ba = all-(fr*100);
		if(fr<=0 || ba <= 0)System.out.println("NA");
		else if(0<fr&&fr<=12 && 0<ba&&ba<=12) System.out.println("AMBIGUOUS");
		else if(0<fr&&fr<=12) System.out.println("MMYY");
		else if(0<ba&&ba<=12) System.out.println("YYMM");
	}
}