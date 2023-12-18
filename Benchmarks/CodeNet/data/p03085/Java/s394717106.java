
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc=new Scanner(System.in);
		input=sc.next();
		String output=null;
		if(input.equals("A")) {
			output="T";
		}else if(input.equals("C")) {
			output="G";
		}else if(input.equals("G")) {
			output="C";
		}else if(input.equals("T")) {
			output="A";
		}
		System.out.println(output);
	}

}
