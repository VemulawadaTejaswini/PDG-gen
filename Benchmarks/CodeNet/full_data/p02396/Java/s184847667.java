import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	List<Integer> list = new ArrayList<Integer>();

    	while(true) {
    		int inputDate = scn.nextInt();
    		if (inputDate != 0) {
    		list.add(inputDate);
    		} else{
    			list.add(inputDate);
    			break;
    		}
    	}
    	for (int i=1; i < list.size(); i++ ) {
    		System.out.println("Case " + i + "; " + list.get(i-1) );
    	}
    }
}
