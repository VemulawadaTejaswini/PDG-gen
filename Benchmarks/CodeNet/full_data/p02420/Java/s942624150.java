import java.util.Scanner;
 
class Main {
  	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		while (true) {
      			String str = sc.next();
      			if (str.equals("-")) {
        			break;
      			}
      			int x = sc.nextInt();
      			for (int i = 0; i < x; i++) {
        			int y = sc.nextInt();
        			str = str.substring(y) + str.substring(0, y);
      			}
      			System.out.println(str);
    		}
  	}
}