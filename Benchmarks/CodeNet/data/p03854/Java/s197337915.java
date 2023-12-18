import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		StringBuffer sb = new StringBuffer(original);
		String reverse = sb.reverse().toString();

		String refs[] = {"maerd","remaerd","esare","resare"};

		while(reverse.length()>0) {

			int counter = 0;
			for(String ref : refs) {
				if(reverse.startsWith(ref)) {
					reverse = reverse.substring(ref.length());
					continue;
				}
				counter++;
			}
			if(counter==4) {
				break;
			}
		}

		String output;
		if(reverse.length()==0) {
			output = "YES";
		}else {
			output = "NO";
		}

		System.out.println(output);

	}

}
