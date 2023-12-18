import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
      	String[] ary = line.split(" ", 0);
      	Arrays.sort(ary, Collections.reverseOrder());
      	System.out.println(Integer.parseInt(
          ary[0] + ary[1]) + Integer.parseInt(ary[2]));
    }
}