import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			
			
			switch(s.charAt(i)){
			case '0':sb.append('0');
			break;
			case '1':sb.append('1');
			break;
			case 'B':if(sb.length() != 0)sb.deleteCharAt(sb.length()-1);
			}
		}
		System.out.print(sb.toString());
		
	}

}
