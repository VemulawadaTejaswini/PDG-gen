import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int S2 = Integer.parseInt(S);
		
		int out1 = S2 / 100;
		int out2 = S2 - out1*100;
		
		//System.out.println(out1 + "  "+ out2);
		boolean flag1 = false, flag2 = false;
		if(out1 <= 12 && out1 > 0) {
			flag1 = true;
		}
		if(out2 <= 12 && out2 > 0) {
			flag2 = true;
		}
		
		if(flag1 && flag2)System.out.println("AMBIGUOUS");
		else if(flag1)System.out.println("MMYY");
		else if(flag2)System.out.println("YYMM");
		else System.out.println("NA");
	}

}
