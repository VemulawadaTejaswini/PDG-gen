
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String S = new java.util.Scanner (System.in).nextLine();	
		String[] ar = S.split("");
		int t = 0;
		for (int i= 0; i<4;i++) {
			if(ar[i] == "+" ) t++;
			else t--;
		}
		
		System.out.println(t);
		}

}
