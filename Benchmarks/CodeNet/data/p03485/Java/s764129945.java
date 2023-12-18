import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		out.println((int)ceil((double)(a+b)/2));
	}
}
