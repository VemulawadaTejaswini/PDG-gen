import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next(),b = scanner.next(),c = scanner.next();
		int cta = 0,ctb = 0,ctc = 0;
		cta++;
		String pos = String.valueOf(a.charAt(0));
		boolean check = true;
		while(check){
			switch(pos){
			case "a":
				if(cta == a.length()-1){
					check = false;
				}else{
					cta++;
					pos = String.valueOf(a.charAt(cta));
				}
				break;
			case "b":
				if(ctb == b.length()-1){
					check = false;
				}else{
					ctb++;
					pos = String.valueOf(b.charAt(ctb));
				}
				break;
			case "c":
				if(ctc == c.length()-1){
					check = false;
				}else{
					ctc++;
					pos = String.valueOf(c.charAt(ctc));
				}
				break;
			}
		}
		switch(pos){
		case "a":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
			break;
		case "c":
			System.out.println("C");
			break;
		}
	}
}


