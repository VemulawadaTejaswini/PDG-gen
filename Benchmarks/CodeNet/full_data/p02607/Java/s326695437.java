import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0;
		for (int i=1; i<=n; i++)
			if (in.nextInt()%2 == 1 && i%2 == 1)
				count++;
		System.out.println(count);
	}
}

