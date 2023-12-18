import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	//	String str = "CODEFESTIVel";
		String n = " ";

			System.out.println();
			char[] str_a = str.toCharArray();
			boolean flag = true;
			char[] str_1 = new char[4];
			char[] str_2 = new char[str.length()-4];

				String a = new String(str_1);
				String b = new String(str_2);
				String c = a+" "+b+'\n';
				System.out.println(c);

	}
 
}