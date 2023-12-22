import java.util.*;

public class Main {
	
	Stack<String> math = new Stack<String>();
	ArrayList<Object> equation = new ArrayList<Object>();
	
	public int evaluate() {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		in = new Scanner(line);
		String operators = "+-/*";
		while(in.hasNext()) {
			if(in.hasNextInt()) {
				equation.add(in.nextInt());
			}
			else {
				equation.add(in.next());
			}
		}
		in.close();
		for(int i = 0 ; i <equation.size(); i++) {
			if(equation.get(i).getClass().equals(Integer.class)) {
				math.push(String.valueOf(equation.get(i)));
			}
			else {
				int first =  Integer.valueOf(math.pop());
				int second = Integer.valueOf(math.pop());
				if(equation.get(i).equals(operators.substring(0,1))) {
					int ans = second + first;
					math.push(String.valueOf(ans));
				}
				else if(equation.get(i).equals(operators.substring(1,2))) {
					int ans = second - first;
					math.push(String.valueOf(ans));
				}
				else if(equation.get(i).equals(operators.substring(2,3))) {
					int ans = second / first;
					math.push(String.valueOf(ans));
				}
				else if(equation.get(i).equals(operators.substring(3,4))){
					int ans = second * first;
					math.push(String.valueOf(ans));;
				}
			}
		}
		return Integer.valueOf(math.pop()); 
	
	}
	
	public static void main(String[] args) {
		Main a = new Main();
		System.out.println(a.evaluate());
		
	}
}
