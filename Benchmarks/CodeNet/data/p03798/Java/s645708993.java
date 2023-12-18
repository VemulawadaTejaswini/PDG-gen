import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	static int N = scan.nextInt();
	static String str = scan.next();
	static String s[] = new String[N];

	public static void main(String[] args) {

		s[0] = "S";
		s[1] = "S";

		if(ok()){
			for(int i=0;i<str.length();i++){
				System.out.print(s[i]);
			}
			System.out.println();
		}else{
			s[0] = "S";
			s[1] = "W";

			if(ok()){
				for(int i=0;i<str.length();i++){
					System.out.print(s[i]);
				}
				System.out.println();
			}else{
				s[0] = "W";
				s[1] = "S";

				if(ok()){
					for(int i=0;i<str.length();i++){
						System.out.print(s[i]);
					}
					System.out.println();
				}else{
					s[0] = "W";
					s[1] = "W";

					if(ok()){
						for(int i=0;i<str.length();i++){
							System.out.print(s[i]);
						}
						System.out.println();
					}else{
						System.out.println("-1");
					}
				}
			}

		}

	}

	private static boolean ok() {
		boolean ok = false;

		for(int i=1;i<str.length();i++){
			if(s[i].equals("S")){
				if(i == str.length()-1){
					if(str.charAt(i) == 'x' && s[0].equals("S")){
						if(s[i-1].equals("W")){
							ok = true;
						}
					}
				}else if(str.charAt(i) == 'o'){
					s[i+1] = "S";
				}else{
					if(s[i-1].equals("S")){
						s[i+1] = "W";
					}else{
						s[i+1] = "S";
					}
				}
			}else{
				if(i == str.length()-1){
					if(str.charAt(i) == 'x' && s[0].equals("W")){
						ok = true;
					}
				}else if(str.charAt(i) == 'o'){
					if(s[i-1].equals("S")){
						s[i+1] = "W";
					}else{
						s[i+1] = "S";
					}
				}else{
					s[i+1] = "S";
				}
			}
		}

		return ok;

	}

}
