import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			int []b = new int[26];
			int c = a.length();
			char e;
			int f;
			for(int d=0 ; d<c ; d++){
				e = a.charAt(d);
				if((int)e>=97 && (int)e<=122){
					b[(int)e-97] += 1;
				}
			}
			for(char d=97 ; d<123 ; d++){
				System.out.println(d+" : "+b[d-97]);
			}
	}
}