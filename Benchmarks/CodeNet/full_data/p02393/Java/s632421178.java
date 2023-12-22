import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] numbers = new int[3];
	for (int i = 0; i < numbers.length; i++) {
	    String input = scan.next();
	    numbers[i] = Integer.parseInt(input);
	}
	for (int i = 0; i < 3; i++) {
	    int key = numbers[i];
	    for (int j = i+1; j < 3; j++) {
		if (key > numbers[j]) {
		    int tmp = numbers[j];
		    numbers[j] = key;
		    numbers[i] = tmp;
		}
	    }
	}
	System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}