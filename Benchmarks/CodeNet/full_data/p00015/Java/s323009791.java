import java.util.Scanner;

public class Main {
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
		cal[i] = cali % 100000000;
		if (cali >= 100000000) {
		  if (i == 9) isOverflow = true;
		  else cal[i + 1] += cali / 100000000;
		}
	  }
	}
	if (isOverflow) {
	  System.out.println("overflow");
	} else {
	  StringBuilder sb = new StringBuilder();
	  for (int i = 0; i < 10; i++) {
		sb.insert(0, cal[i]);
		int ketaSize = sb.length() % 8;
		if (ketaSize != 0) {
		  sb.insert(0, "00000000", 0, 8 - ketaSize);
		}
	  }
	  while (sb.charAt(0) == '0' && sb.length() != 1) {
		sb.deleteCharAt(0);
	  }
	  System.out.println(sb);
	}
  }
}

private static int[] makeIntArray(String a) {
  int[] val = new int[10];
  StringBuilder sb = new StringBuilder(a)
	  .insert(0, "        ", 0, 8 - a.length() % 8);
  int keta8x = sb.length() / 8;
  for (int i = keta8x; i > 0; i--) {
	String trim = sb.substring((i - 1) * 8, i * 8).trim();
	if (!"".equals(trim)) {
	  val[keta8x - i] = Integer.parseInt(trim);
	}
  }
  return val;
}
}