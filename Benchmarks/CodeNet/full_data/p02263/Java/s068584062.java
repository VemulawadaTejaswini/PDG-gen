import java.util.Scanner;

public class Main {
	static int[] str = new int[100];
	static int i = 0;
	static void push(int k) {
		if (isFull()==false){
			i++;
			str[i] = k;
		}
		else{
			System.out.print("?????????????????????");
		}
	}
	static int pop() {
		if (isEmpty()==false){
		i--;
		return str[i+1];
	    }
		else{
		String f = "??¢??????????????????";
		int q = Integer.parseInt(f);
			return q;
		}
		}
	static boolean isNumber(String j) {
	    try {
	        Integer.parseInt(j);
	        return true;
	        } catch (NumberFormatException e) {
	        return false;
	    }
	}
	static boolean isEmpty(){
		if (i == 0){
			return true;
		}
		return false;
	}
	static boolean isFull(){
		if (i >= 99){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] array = in.nextLine().split(" ");
		int size = array.length;
		for (int h=0;h<size;h++){
			if (array[h].equals("+")){
				int b = pop();
				int c = pop();
				int d = c + b;
				push(d);
			}
			else if (array[h].equals("-")){
				int b = pop();
				int c = pop();
				int d = c - b;
				push(d);
			}
			else if (array[h].equals("*")){
				int b = pop();
				int c = pop();
				int d = c * b;
				push(d);
			}
			else
				if (isNumber(array[h])){
				int k = Integer.parseInt(array[h]);
				push(k);
			}
		}
		System.out.print(str[i]);
	}
}