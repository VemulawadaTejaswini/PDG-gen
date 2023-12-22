import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] str = new String[2];
		int count = 0; 
		while(in.hasNext()) {
			String buf = in.nextLine();
			str[count] = buf;
		}
		
		String[] split = str[0].split(" ");
		int facter[];
		facter = new int[split.length];

		for ( int i = 0; i < split.length; i++) {
			facter[i] = Integer.parseInt(split[i]);
			
		}
		//swap
		if ( facter[0] < facter[1]) {
			int temp = facter[0];
			facter[0] = facter[1];
			facter[1] = temp;

		}
		
		int r = 0; 
		int x = facter[0];
		int y = facter[1];
		
		while (y > 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println(x);
		
		
		
	}

}