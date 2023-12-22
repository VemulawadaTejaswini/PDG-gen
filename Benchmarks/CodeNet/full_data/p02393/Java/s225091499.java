import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	Scanner in= new Scanner(System.in);
	ArrayList<Short> list = new ArrayList<Short>();
        list.add(in.nextShort());
        list.add(in.nextShort());
        list.add(in.nextShort());
	Collections.sort(list);

	byte c = 0;
	String s;
	for (Short i: list){
		if (c <list.size()-1)
			s = " ";
		else
			s = "";
	        System.out.printf("%d%s", i, s);
	}
        System.out.println();
    }   
}