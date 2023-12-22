import java.util.Scanner;

public class Main {
private static final int _8KETA = 100000000;

// あえてBigIntegerは使わない方法で
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  for (int dataSet = in.nextInt(); dataSet > 0; dataSet--) {
	String a = in.next();
	String b = in.next();
	boolean isOverflow = a.length() > 80 || b.length() > 80;
	int[] cal = new int[10];
	if (!isOverflow) {
	  int[] aVal = makeIntArray(a);
	  int[] bVal = makeIntArray(b);
	  for (int i = 0; i < 10; i++) {
		int ai = aVal[i];
		int bi = bVal[i];
		int cali = ai + bi;
		cal[i] = cali % _8KETA;
		if (cali >= _8KETA) {
		  if (i == 9) isOverflow = true;
		  else aVal[i + 1] += cali / _8KETA;
		}
	  }
	}
	if (isOverflow) {
	  System.out.println("overflow");
	} else {
	  StringBuilder sb = new StringBuilder();
	  for (int i = 0; i < 10; i++) {
		sb.insert(0, cal[i]);
		if (cal[i] < 1000000) {
		  sb.insert(0, "00000000", 0, 8 - (sb.length() % 8));
		}
	  }
	  while (sb.charAt(0) == '0' && sb.length() != 1) {
		sb.deleteCharAt(0);
	  }
	  System.out.println(sb);
	}
  }
}