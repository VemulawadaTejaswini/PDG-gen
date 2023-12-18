import java.io.*;
import java.util.*;
import java.util.stream.Stream;
public class Main {
	public static Scanner stdIn = new Scanner(System.in);
	public static void main(String[] args){
		String L1 = stdIn.nextLine();
		String L2 = stdIn.nextLine();
		String[] s1 = L1.split(" ", 0);
		String[] s2 = L2.split(" ", 0);
		int[] i2 = Stream.of(s2).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(i2);
		int r=0;
		for (int i=Integer.parseInt(s1[1]);i>0;i--){
			 r+=i2[i];
			System.out.println(r);
		}
		System.out.println(r);
	}
}