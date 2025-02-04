import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  boolean hasNext;
  do {
	int start = in.nextInt();
	int end = in.nextInt();
	hasNext = in.hasNext();
	if (start != 0) {
	  if (start % 4 != 0) {
		start += (4 - start % 4);
	  }
	  boolean hasUru = false;
	  for (int year = start; year <= end; year = year + 4) {
		boolean isX100 = year % 100 != 0;
		boolean isX400 = year % 400 == 0;
		if (isX400 || isX100) {
		  System.out.println(year);
		  hasUru = true;
		}
	  }
	  if (!hasUru) {
		System.out.println("NA");
	  }
	}
	if (hasNext) {
	  System.out.println();
	}
  } while (hasNext);
}
}