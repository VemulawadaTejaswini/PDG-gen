import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader in =
new BufferedReader(new InputStreamReader(System.in))) {
			
String line;
line = in.readLine();

int n = Integer.parseInt(line);

int[][] sayTable = new int[n][];
for (int i = 0; i < n; ++i) {
line = in.readLine();
int a = Integer.parseInt(line);
sayTable[i] = new int[a];
for (int j = 0; j < a; ++j) {
line = in.readLine();
String[] params = line.split(" ");
	int x = Integer.parseInt(params[0]) - 1;
	int y = Integer.parseInt(params[1]);
		sayTable[i][x] = y + 1;
	}
}
int maxHonest = search(say, new int[n]);
System.out.println(maxHonest);
}
	}

	public static int search(
int[][] sayTable, int[] honest, int i) {

		if (i >= sayTable.length) {
			return (int) Arrays.stream(honest)
.filter(say -> say == 2)
.count();
		}

		int[] sayArray = sayTable[i];

		int count = 0;
		{
		if (checkHonest(honest, sayArray)) {
		int[] copyHonest = Arrays.copyOf(honest, honest.length);
int c = search(sayTable, copyHonest, i + 1);
count = Math.max(c, count);
		}
	}
	{
		if (checkUnkind(honest, sayArray)) {
		int[] copyHonest = Arrays.copyOf(honest, honest.length);
int c = search(sayTable, copyHonest, i + 1);
count = Math.max(c, count);
		}
	}
return count;
}



	public static boolean checkHonest(int[] honest, int[] sayArray) {
		for (int i = 0; i < sayArray.length; ++i) {
			int say = sayArray[i];
			if (say < 0) {
				continue;
			}
			int h = honest[i];
			if (h != 0 || h != say) {
return false;				
			}
		}
return true;
	}

	public static boolean checkUnkind(int[] honest, int[] sayArray) {
		for (int i = 0; i < sayArray.length; ++i) {
			int say = sayArray[i];
			if (say < 0) {
				continue;
			}
			int h = honest[i];
			if (h != 0 || h == say) {
return false;				
			}
		}
return true;
	}

public static void setHonest(int[] honest, int[] sayArray) {
		for (int i = 0; i < sayArray.length; ++i) {
			int say = sayArray[i];
			if (say == 1) {
				honest[i] = 1;
			} else if (say == 2) {
				honest[i] = 2;
			}
		}
	}

	public static void setUnkind(int[] honest, int[] sayArray) {
		for (int i = 0; i < sayArray.length; ++i) {
			int say = sayArray[i];
			if (say == 1) {
				honest[i] = 2;
			} else if (say == 2) {
				honest[i] = 1;
			}
		}
	}
}

