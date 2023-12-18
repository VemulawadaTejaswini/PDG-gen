import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String s2;
		double num;
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+4;j<s.length()+1;j++) {
				s2 = s.substring(i, j);
				num = Double.parseDouble(s2);
				if(num % 2019 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
