import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		char c = inputs.next().charAt(0);
		if(c>=65&&c<91) {
			System.out.println('A');
		}
		else
			System.out.println('a');
	}

}
