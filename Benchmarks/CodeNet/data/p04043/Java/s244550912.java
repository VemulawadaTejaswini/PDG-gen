

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(Integer.parseInt(scanner.next()));
	  list.add(Integer.parseInt(scanner.next()));
	  list.add(Integer.parseInt(scanner.next()));
	  Collections.sort(list);
	  if(list.get(0) == 5 && list.get(1) == 5 &&list.get(2) == 7) {
		  System.out.print("YES");
	  }else {
		  System.out.print("NO");
	  }
	  
	  scanner.close();
  }
}