import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(sc.hasNext()) {
			String s = sc.nextLine();
			s += " ";
			String n = "";
			for(int i = 0; i < s.length(); i++) {
				String t = s.substring(i, i + 1);
				if(t.matches("[0-9]")) {
					if(n.length() == 0 && t.equals("0")) continue;
					n += t;
				}else {
					if(n.length() > 0) {
						sum += Integer.parseInt(n);
						n = "";
					}
				}
			}
		}
		sc.close();
		System.out.println(sum);
	}
}
