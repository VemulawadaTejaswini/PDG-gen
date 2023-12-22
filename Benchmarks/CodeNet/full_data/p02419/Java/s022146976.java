import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String strs=sc.next();
		int i=0;
		while(sc.hasNext()) {
			String str=sc.next();
			if(str.equals("END_OF_TEXT"))break;
			if(str.equalsIgnoreCase(strs)) {
				i+=1;
			}
		}
		System.out.println(i);
		sc.close();
	}
}
