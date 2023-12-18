
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();

		Iroha solver = new Iroha();

//		System.out.println(solver.solve(input));
		System.out.println(solver.anotherSolve(input));

    }

    static class Iroha {

    	public String anotherSolve(String input) {
    		List<Integer> inputList = new ArrayList<Integer>();
    		int five = 0;
    		int seven = 0;

    		for(String s:input.split(" ")) {
    			if(Integer.parseInt(s)== 5) {
    				five++;
    			} else if (Integer.parseInt(s)==7) {
    				seven++;
    			}
    		}
    		if (five == 2 && seven == 1) {
    			return "YES";
    		} else {
    			return "NO";
    		}
    	}
    }

}
