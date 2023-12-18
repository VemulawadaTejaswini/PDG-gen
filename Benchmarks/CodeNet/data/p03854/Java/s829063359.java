import java.util.*;
import java.math.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int ans = 1;
		while(in.length() > 0){
			if (in.length() >= 5 && in.substring(in.length() - 5).compareTo("dream") == 0){in = in.substring(0,in.length() - 5);}
			else if (in.length() >= 5 && in.substring(in.length() - 5).compareTo("erase") == 0){in = in.substring(0,in.length() - 5);}
			else if (in.length() >= 6 && in.substring(in.length() - 6).compareTo("eraser") == 0){in = in.substring(0,in.length() - 6);}
			else if (in.length() >= 7 && in.substring(in.length() - 7).compareTo("dreamer") == 0){in = in.substring(0,in.length() - 7);}
			else {
				ans = 0;
				break;
			}
		}
		if(ans == 0){System.out.println("NO");}
		else{
			System.out.println("YES");
		}
	}

}
