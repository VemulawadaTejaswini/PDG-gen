import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	char[] inputArray = new char[input.length()];
	for (int i = 0; i < input.length(); i++) {
	    char alpabet = input.charAt(i);
	    if (Character.isUpperCase(alpabet)) {
		inputArray[i] = Character.toLowerCase(alpabet);
	    } else if (Character.isLowerCase(alpabet)){
		inputArray[i] = Character.toUpperCase(alpabet);
	    } else {
		inputArray[i] = alpabet;
	    }
	}
	System.out.println(String.valueOf(inputArray));
    }
}