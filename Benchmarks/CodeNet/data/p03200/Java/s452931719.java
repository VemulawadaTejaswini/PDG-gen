import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] inputs = input.toCharArray();
		int result = 0;
		
		boolean isSwitch = true;
		while (isSwitch) {
		    isSwitch = false;
		    for (int i = 0; i < inputs.length - 1; i++) {
		        if (inputs[i] == 'B' && inputs[i + 1] == 'W') {
		            inputs[i] = 'W';
		            inputs[i + 1] = 'B';
		            result++;
		            isSwitch = true;
		        }
		    }
		}
		
		System.out.println(result);
    }
}