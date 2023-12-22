import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		int count = scan.nextInt();
	
		ArrayList<Integer> array = new ArrayList<Integer>(count);
		for (int i=0; i < count; i++){
			array.add(scan.nextInt());
		}
		java.util.Iterator<Integer> ite = array.iterator();
		
		String str = "";
		while(ite.hasNext()){
			str = str + " "+ ite.next();
		}
		System.out.println(str);
	}

}