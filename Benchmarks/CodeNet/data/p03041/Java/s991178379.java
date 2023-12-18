import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char[] list = sc.next().toCharArray();
		if (list[k - 1]== 'A')
			list[k - 1] ='a';
		if(list[k - 1] == 'B')
			list[k - 1] ='b';
		if(list[k - 1] == 'C')
		list[k - 1] = 'c';
		for(char m: list)
			out.print(m);
		
	}
}