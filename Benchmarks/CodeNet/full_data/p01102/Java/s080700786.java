import java.util.Scanner;

public class Main {
  static final String IDENTICAL = "IDENTICAL";
  static final String CLOSE = "CLOSE";
  static final String DIFFERENT = "DIFFERENT";

  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (true) {
	  String s1 = in.next();
	  if (s1.equals(".")) break;
	  String[] arrStr1 = s1.split("\"", -1);
	  String s2 = in.next();
	  String[] arrSrt2 = s2.split("\"", -1);

	  if (arrStr1.length == arrSrt2.length) {
		int result = 0;
		for (int i = 0; i < arrStr1.length; i++) {
		  if (i % 2 == 0 && !arrStr1[i].equals(arrSrt2[i])) {
			result += 2;
		  } else if (i % 2 == 1 && !arrStr1[i].equals(arrSrt2[i])) {
			result++;
		  }
		}
		if (result == 0) {
		  System.out.println(IDENTICAL);
		} else if (result == 1) {
		  System.out.println(CLOSE);
		} else {
		  System.out.println(DIFFERENT);
		}
	  } else {
		System.out.println(DIFFERENT);
	  }
	}
  }
}

