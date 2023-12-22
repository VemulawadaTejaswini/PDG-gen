import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String s=scanner.next();
			int joi=0,ioi=0;
			for(int i=0;i<s.length()-2;i++){
				if(s.charAt(i+1)=='O'&&s.charAt(i+2)=='I'){
					switch(s.charAt(i)){
					case 'J':
						joi++;
						break;
					case 'I':
						ioi++;
						break;
					}
				}
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}