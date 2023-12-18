import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(scanner.nextInt());		
		System.out.println(hs.size());
		scanner.close();
	}


}
