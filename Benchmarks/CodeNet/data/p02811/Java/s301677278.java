import java.util.*;

public class Main{
  
  public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	  int numberOfSheets = scanner.nextInt();
	  int standardValue  = scanner.nextInt();
	  int total = moneyCollection(numberOfSheets);
	  if (total >= standardValue) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}
	  

  }

private static int moneyCollection(int numberOfSheets) {
	int sum = 500 * numberOfSheets;
	return sum;
}
}