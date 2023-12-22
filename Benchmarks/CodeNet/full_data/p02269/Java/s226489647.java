import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		StringBuilder str = new StringBuilder();
		
		// 命令数入力
		final int n = scan.nextInt();
		
		for (int i = 0; i < n; i ++) {
			
			//　命令 （insert か find )
			final String ord = scan.next();
			final String word = scan.next();
			
			if (ord.equals("insert")) {
				str.append(word + " ");
			} else if (ord.equals("find")){
				String dictionary = str.toString();
				if (dictionary.contains(word)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
			
		}
		scan.close();
	}
}

