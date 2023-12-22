import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Stack<String> seq = new Stack<String>();
		String opers = "+-/*";
		ArrayList<String> arr = new ArrayList<String>();
		Scanner out = new Scanner(System.in);
		String line = out.nextLine();
		Scanner in = new Scanner(line);
		while(in.hasNext()) {
			arr.add(in.next());
		}
		for(int i = 0; i < arr.size(); i++) {
			if(!opers.contains(arr.get(i))) seq.push(arr.get(i));
			else {
				int num = Integer.valueOf(seq.pop());
				int num1 = Integer.valueOf(seq.pop());
				if(arr.get(i).equals(opers.substring(0, 1))) {
					seq.push(String.valueOf(num1 + num));
				}
				else if(arr.get(i).equals(opers.substring(1, 2))) {
					seq.push(String.valueOf(num1 - num));
				}
				else if(arr.get(i).equals(opers.substring(2, 3))) {
					seq.push(String.valueOf(num1 / num));
				}
				else {
					seq.push(String.valueOf(num1 * num));
				}
			}
		}
		System.out.println(Integer.valueOf(seq.pop()));
	}

}
