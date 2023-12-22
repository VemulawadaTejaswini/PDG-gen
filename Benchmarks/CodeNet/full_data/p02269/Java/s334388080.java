import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();
	    
		String x = "";
		try {
			int lim = Integer.parseInt(in.readLine());

			for (int i = 0; i < lim; i++) {
				x = in.readLine();
				String[] param = x.split(" ");
				
				if (param[0].equals("insert")) {
					al.add(param[1]);
				} else {
					if (al.contains(param[1]) == true) System.out.println("yes");
					else System.out.println("no");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}