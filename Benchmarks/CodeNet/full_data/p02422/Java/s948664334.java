import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		String str = std.nextLine();
		int q = Integer.parseInt(std.nextLine());

		for(int i=0; i<q; i++){
			String query = std.next();
			int a = Integer.parseInt(std.next());
			int b = Integer.parseInt(std.next());

			if(query.equals("print")){
				System.out.println(str.substring(a, b+1));

			}else if(query.equals("reverse")){
				StringBuffer sb = new StringBuffer(str.substring(a, b+1));
				String rev = sb.reverse().toString();
				str = str.substring(0, a) + rev + str.substring(b+1, str.length());

			}else if(query.equals("replace")){
				String rep = std.next();
				str = str.substring(0, a) + rep + str.substring(b+1, str.length());
			}
		}
	}
}