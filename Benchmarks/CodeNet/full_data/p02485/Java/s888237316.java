import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			String n = in.next();
			char[] c = n.toCharArray();
			if(c[0] == '0') break;
			for(int i = 0;i < c.length;i++){
				int a = Integer.parseInt(""+c[i]);
				count = count + a;
			}
			System.out.println(count);
		}
	}
}