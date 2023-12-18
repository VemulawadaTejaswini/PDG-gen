import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);

		String sA = in.next();
		String sB = in.next();
		
		if(sA.length() == sB.length()){
			int comp = sA.compareTo(sB);
			System.out.println(comp == 0 ? "EQUAL" : (comp > 0 ? "GREATER" : "LESS"));
		}else{
			System.out.println(sA.length() > sB.length() ? "GREATER" : "LESS");
		}
	}
}