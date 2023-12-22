import java.util.Scanner;
import java.util.regex.Pattern;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		StringBuilder str = new StringBuilder();
		str.append(' ');
		
		// 命令数入力
		final int n = scan.nextInt();
		
		for (int i = 0; i < n; i ++) {
			
			//　命令 （insert か find )
			final String ord = scan.next();
			final String word = scan.next();
			
			if (ord.equals("insert")) {
				str.append(word);
				str.append(" ");
			} else if (ord.equals("find")){
				String pattern = " " + word + " ";
				Pattern p = Pattern.compile (pattern);
				if (p.matcher(str).find()) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
			
		}
		scan.close();
	}
}

