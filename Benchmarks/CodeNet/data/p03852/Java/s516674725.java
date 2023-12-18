import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		char[] c = {'a','i','u','e','o'};
		System.out.println(
				Arrays.binarySearch(c, s.next().charAt(0))>=0
				?
				"consonant":"vowel");
	}
}