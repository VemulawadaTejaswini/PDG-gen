import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
	char[] c = {'a','e','i','o','u'};
		System.out.println(
				Arrays.binarySearch(c, s.next().charAt(0))>=0
				?
				"vowel":"consonant");
	}
}