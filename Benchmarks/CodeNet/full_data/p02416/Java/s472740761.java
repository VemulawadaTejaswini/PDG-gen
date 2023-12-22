import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int []b = new int[26];
			char e;
			while(sc.hasNext()){
				String a = sc.next();
				a = a.toLowerCase();
				int c = a.length();
				for(int d=0 ; d<c ; d++){
					e = a.charAt(d);
					if((int)e>=97 && (int)e<=122){
						b[(int)e-97] += 1;
					}
				}
			}
			for(char d=97 ; d<123 ; d++){
				System.out.println(d+" : "+b[(int)d-97]);
			}
	}
}