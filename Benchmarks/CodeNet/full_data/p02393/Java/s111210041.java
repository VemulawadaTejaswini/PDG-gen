import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {
		  @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	        String[] inputNums = scan.nextLine().split(" ");
	        System.out.println(compThreeNumers(inputNums));
	    }
	    private static String compThreeNumers(String[] inputNums) {
	        ArrayList<Long> sortedNums = new ArrayList<Long>();
	        for(String inputNum :inputNums) {
	            sortedNums.add( Long.parseLong(inputNum));
	        }
	        Collections.sort(sortedNums);

	        String space = " ";
	        String resultNums = sortedNums.get(0).toString();
	        for(int i = 1; i < sortedNums.size(); i++) {
	            resultNums += space + sortedNums.get(i).toString();
	        }
	        return resultNums;
	    }
	}