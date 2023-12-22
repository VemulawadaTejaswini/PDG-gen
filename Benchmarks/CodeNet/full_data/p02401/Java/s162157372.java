import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		List <Integer> arraylistA = new ArrayList <Integer> ();
		List <String> arraylistOP = new ArrayList <String> ();
		List <Integer> arraylistB = new ArrayList <Integer> ();
		String OP;
		
		do {
			arraylistA.add(stdIn.nextInt());
			OP = stdIn.next();
			arraylistOP.add(OP);
			arraylistB.add(stdIn.nextInt());
		} while(!OP.equals("?"));
		
		for(int i = 0; i < arraylistA.size() - 1; i++) {
			if(arraylistOP.get(i).equals("+")) {
				System.out.println(arraylistA.get(i) + arraylistB.get(i));
			}
			else if(arraylistOP.get(i).equals("-")) {
				System.out.println(arraylistA.get(i) - arraylistB.get(i));
			}
			else if(arraylistOP.get(i).equals("*")) {
				System.out.println(arraylistA.get(i) * arraylistB.get(i));
			}
			else if(arraylistOP.get(i).equals("/")) {
				System.out.println(arraylistA.get(i) / arraylistB.get(i));
			}
		}
	}
}