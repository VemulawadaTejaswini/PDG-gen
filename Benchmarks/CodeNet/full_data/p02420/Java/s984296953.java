import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int num;
		int e_num;
		String line;
		String extra_line;
		String before_extra_line;
		 while(true) {
			 if((line = sc.next()).equals("-")) break;
			 num = sc.nextInt();
			 for(int i = 0; i < num; i ++) {
				 e_num = sc.nextInt();
				 extra_line = line.substring(0,e_num);
				 before_extra_line = line.substring(e_num, line.length());
				 line = before_extra_line + extra_line;
			 }
			 System.out.println(line);
		 }
	}
}
