import java.util.Scanner;
import java.util.*;
import java.util.Iterator;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String line;
		while(input.hasNext()){
			int i = 1;
			line = input.next();
			int intLine = Integer.parseInt(line);
			if(intLine!=0){
				System.out.print("Case"+i+":"+" "+intLine);
			}
		}
	}
}