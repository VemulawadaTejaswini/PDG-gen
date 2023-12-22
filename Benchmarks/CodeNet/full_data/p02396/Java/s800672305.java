import java.util.Scanner;
public class dateset {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		for(int i=1;!"0".equals(str);i++){
			System.out.println("Case "+i+": "+str);
			str = scan.next();
		}
		scan.close();
	}
}