import java.util.Arrays;

public class Main {
	public static void main(String[] age){
		String input = new java.util.Scanner(System.in).nextLine();
		String[] arrayinput = input.split(" ");
		int a = Integer.parseInt(arrayinput[0]);
		int b = Integer.parseInt(arrayinput[1]);
		int c = Integer.parseInt(arrayinput[2]);
		int numbers[] = {a, b, c};
		Arrays.sort(numbers);
		a = numbers[0];
		b = numbers[1];
		c = numbers[2];
		System.out.println(a+" "+b+" "+c);
	}
}