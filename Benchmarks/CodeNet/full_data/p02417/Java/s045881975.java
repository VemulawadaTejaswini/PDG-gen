import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	int[] alpabetDict = new int[26];
	char[] inputArray = input.toCharArray();
	int count = 0;
	for (int i = 0; i < inputArray.length; i++) {
	    if (Character.isLetter(inputArray[i])) {
		alpabetDict[(int)Character.toLowerCase(inputArray[i]) - 'a']++;
	    }
	}
	for (int i = 0; i < 26; i++) {
	    System.out.println((char)(i+'a') + " : " + alpabetDict[i]);
	}
    }
}