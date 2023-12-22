

import java.util.Scanner;
import java.util.Stack;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		String input = in.nextLine(); 
		
		System.out.println(reversePolish(input));
		
	}
	public static int reversePolish(String input) {
		
		Stack<Integer> st = new Stack<Integer>(); 
		
		String[] arr = input.split(" "); 
		
		for(int i = 0; i < arr.length; i++) {
			 
			if(isNumeric(arr[i]))
				st.push(Integer.parseInt(arr[i])); 
			else {
				int ans = 0; 
				int x1 = st.pop(); 
				int x2 = st.pop(); 
				ans = performMath(x2, x1, arr[i]); 
				st.push(ans); 
			}
		}
		return st.pop()	; 
	}
	public static int performMath(int a, int b, String str) {
		switch(str){
	    case "+":
	        return a + b;
	    case "-":
	        return a - b;
	    case "*":
	        return a * b;
	    case "/":
	        return a / b;
	    default:
	        return 0;
	    }
	}
	public static boolean isNumeric(String strNum) {
	    try {
	        int i = Integer.parseInt(strNum);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}

}

