import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		LinkedList<String> track = new LinkedList<String>();
		for (int i = 0; i < N; i++) {
			String x = input.next();
			if (!track.contains(x)) track.add(x);
		}
		System.out.println(track.size());
	}
}