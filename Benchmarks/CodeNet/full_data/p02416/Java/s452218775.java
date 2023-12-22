import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	static int k(char a) {
		if(a == '0') {
			return 0;
		}
		else if(a == '1') {
			return 1;
		}
		else if(a == '2') {
			return 2;
		}
		else if(a == '3') {
			return 3;
		}
		else if(a == '4') {
			return 4;
		}
		else if(a == '5') {
			return 5;
		}
		else if(a == '6') {
			return 6;
		}
		else if(a == '7') {
			return 7;
		}
		else if(a == '8') {
			return 8;
		}
		else {
			return 9;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List <String> a = new ArrayList<String>();
		String tmp;
		do {
			tmp = stdIn.next();
			a.add(tmp);
		}while(!tmp.equals("0"));
		
		for(int i = 0; i < a.size()-1; i++) {
			tmp = a.get(i);
			int tmpk = 0;
			for(int j = 0; j < tmp.length(); j++) {
				tmpk += k(tmp.charAt(j));
			}
			System.out.println(tmpk);
		}
		
		

	}

}