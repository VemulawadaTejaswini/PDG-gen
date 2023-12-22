import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute20_3();
	}
	
	private static void execute20_3() {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next();
			
			int sum =0;
			for(int i=0;i<n.length();i++) {
				int num = Character.getNumericValue(n.charAt(i));
				sum+=num;
			}
			if(sum%9==0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}