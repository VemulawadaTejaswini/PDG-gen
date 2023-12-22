import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String r = null;
		String a = null;

		r = scan.next();
		a = scan.next();
		while(!r.equals("0") || !a.equals("0")) {
			char rChar[] = r.toCharArray();
			char aChar[] = a.toCharArray();
			
			int hit = 0;
			int blow = 0;
			for(int i = 0 ; i < 4 ; i++) {
				if(rChar[i] == aChar[i]) {

					++hit;
					rChar[i] = ' ';
					aChar[i] = ' ';

				}else{
					
					for(int j = 0 ; j < 4 ;j++) {
						if(rChar[i] == aChar[j]) {
							++blow;
						}
					}
					
				}
			}
			System.out.println(hit +  " " + blow);
			r = scan.next();
			a = scan.next();
		}
	}
}

