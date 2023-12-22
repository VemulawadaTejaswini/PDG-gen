package aoj0110;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Main {
public static void main(String[] args) {
  Pattern pattern = Pattern
	  .compile("([0-9X]+)\\+([0-9X]+)=([0-9X]+)");
  Scanner in = new Scanner(System.in);
  while (in.hasNext()) {
	in.next(pattern);
	MatchResult mr = in.match();
	String a = mr.group(1);
	String b = mr.group(2);
	String c = mr.group(3);
	int num = 0;
	if (a.startsWith("X") && a.length() > 1 ||
	    b.startsWith("X") && b.length() > 1 ||
	    c.startsWith("X") && c.length() > 1) {
	  num++;
	}
	char cnum = 'N';
	for (; num <= 9; num++) {
	  cnum = Character.forDigit(num, 10);
	  BigInteger ia = new BigInteger(a.replace('X', cnum));
	  BigInteger ib = new BigInteger(b.replace('X', cnum));
	  BigInteger ic = new BigInteger(c.replace('X', cnum));
	  if (ia.add(ib).equals(ic)) {
		break;
	  } else {
		cnum = 'N';
	  }
	}
	if (cnum == 'N') {
	  System.out.println("NA");
	} else {
	  System.out.println(cnum);
	}
  }
}
}