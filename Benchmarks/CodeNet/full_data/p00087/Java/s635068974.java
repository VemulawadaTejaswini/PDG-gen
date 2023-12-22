import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static String[] input;
	public static int ptr = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doIt();

	}
	
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			input = s.split(" ");
			ptr = input.length - 1;
			System.out.println(getNext());
		}
	}
	
	public static double getNext(){
		double ret = 0, left = 0, right = 0;
		String s = input[ptr--];
		if(s.equals("+")){
			right = getNext();
			left = getNext();
			ret = left + right;
		}
		else if(s.equals("-")){
			right = getNext();
			left = getNext();
			ret = left - right;
		}
		else if(s.equals("*")){
			right = getNext();
			left = getNext();
			ret = left * right;
		}
		else if(s.equals("/")){
			right = getNext();
			left = getNext();
			ret = left / right;
		}
		else{
			//数字のはず
			ret = Double.parseDouble(s);
		}
		return ret;
	}
}