import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, t = 0;
		String str;
		char[] train;
		
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++){
			str = scan.next();
			char[] ch = str.toCharArray();
			
			train = new char[52];
			
			for(int j = 0; j < ch.length; j += 3){
				train[25 + t] = ch[j];
				if(j < ch.length - 1){
					if(ch[j + 2] == '>')t++;
					else t--;
				}
			}
			for(int j = 0; j < 52; j++){
				System.out.print(train[j]);
			}
		}
	}
}