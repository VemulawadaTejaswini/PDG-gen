import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Main {
public static void main(String[] args) {
  Pattern pattern = Pattern
	  .compile("([0-9X]+)\\+([0-9X]+)=([0-9X]+)");
  Scanner in = new Scanner(System.in);
  while (in.hasNextLine()) {
	in.next(pattern);
	MatchResult mr = in.match();
	String a = mr.group(1);
	String b = mr.group(2);
	String c = mr.group(3);
	int num = 0;
	if (a.startsWith("X") || b.startsWith("X") || c.startsWith("X")) {
	  num++;
	}
	char cnum = 'N';
	for (; num <= 9; num++) {
	  cnum = Character.forDigit(num, 10);
	  int ia = Integer.parseInt(a.replace('X', cnum));
	  int ib = Integer.parseInt(b.replace('X', cnum));
	  int ic = Integer.parseInt(c.replace('X', cnum));
	  if (ia + ib == ic) {break;} else {cnum = 'N';}
	}
	if (cnum == 'N') {
	  System.out.println("NA");
	} else {
	  System.out.println(cnum);
	}
  }
}
}