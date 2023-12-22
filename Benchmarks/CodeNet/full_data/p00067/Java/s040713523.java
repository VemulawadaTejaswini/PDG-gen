import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
public static void main(String[] args) throws IOException {
  InputStream is = System.in;
  Scanner in = new Scanner(is);
  Pattern pattern = Pattern.compile("[0|1]{12}");
  while (in.hasNext(pattern)) {
	int[][] before = new int[12][];
	int[][] line = new int[12][];
	int count = 0, num = 0;
	int[][] old = null;
	for (int col = 0; col < 12; col++) {
	  old = before;
	  before = line;
	  line = old;
	  char[] read = in.next(pattern).toCharArray();
	  // System.out.println(Arrays.toString(read));
	  for (int row = 0; row < 12; row++) {
		if (read[row] == '1') {
		  boolean upperHas = before[row] != null;
		  boolean leftHas = row != 0 && line[row - 1] != null;
		  if (!(upperHas || leftHas)) {
			line[row] = new int[] { num++ };
			count++;
		  } else if (leftHas) {
			line[row] = line[row - 1];
			if (upperHas && line[row][0] != before[row][0]) {
			  line[row][0] = before[row][0];
			  count--;
			}
		  } else if (upperHas) {
			line[row] = before[row];
		  }
		}
		else {
		  line[row] = null;
		}
	  }
	}
	System.out.println(count);
  }
}
}