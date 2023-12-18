import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder buf = new StringBuilder();
		StringBuilder buf2 = new StringBuilder();
		buf.append(str);
		str = scan.nextLine();
		int q = Integer.parseInt(str);
		int invert = 1;
		for (int i = 0; i<q; i++) {
			str = scan.nextLine();
			if (str.compareTo("1") == 0) {
				invert = invert * -1;
			} else {
				String[] substr = str.split(" ", 0);
				if (substr[1].compareTo("1") == 0) {
					if (invert == 1) {
						//buf.insert(0,substr[2] );
						buf2.append(substr[2]);						
					} else {
						buf.append(substr[2]);
					}
				} else {
					if (invert == -1) {
						buf2.append(substr[2]);												
						//buf.insert(0,substr[2] );
					} else {
						buf.append(substr[2]);
					}
				}
			}
		}
		scan.close();
		if (invert == -1) {
			//System.out.println(buf.reverse().toString());
			System.out.println(buf.reverse().append(buf2).toString());
 		} else {
 			//System.out.println(buf.toString());
 			System.out.println(buf2.reverse().append(buf).toString());
 		}
	}
}
