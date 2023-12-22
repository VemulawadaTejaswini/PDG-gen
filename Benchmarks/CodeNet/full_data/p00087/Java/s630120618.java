import java.util.*;

public class Main {
	//0155 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String [] s = sc.nextLine().split(" ");
			LinkedList<Double> stack = new LinkedList<Double>();
			for(int i = 0 ; i <s.length; i++){
				 char c = s[i].charAt(0);
				if(Character.isDigit(c)){
					double res = Integer.parseInt(s[i]);
					stack.addLast(res);
				}
				else{
					double b = stack.removeLast();
					double a = stack.removeLast();
					if(c == '+'){
						double res = a + b;
						stack.addLast(res);
					}
					if(c == '-'){
						double res = a - b;
						stack.addLast(res);
					}
					if(c =='*'){
						double res = a * b;
						stack.addLast(res);
					}
					if(c == '/'){
						double res = a / b;
						stack.addLast(res);
					}
				}
			}
			System.out.println(stack.removeLast());
		}
	}
	public static void main(String [] args){
		new Main().doit();
	}
}