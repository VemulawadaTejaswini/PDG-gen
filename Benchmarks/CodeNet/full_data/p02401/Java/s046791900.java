import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<Integer> answers = new ArrayList<Integer>();
		for(;;){
			String line = scan.nextLine();
			String[] div = line.split("\\s");
			int a = Integer.parseInt(div[0]);
			String op = div[1];
			int b = Integer.parseInt(div[2]);
			if(op.equals("?")){
				break;
			}
			int ans = 0;
			switch(op){
				case "+" :
					ans = a + b;
					break;
				case "-" :
					ans = a - b;
					break;
				case "*" :
					ans = a * b;
					break;
				case "/" :
					ans = a / b;
					break;
				default :
					break;
			}
			answers.add(ans);
		}

		for(int n : answers){
			System.out.println(n);
		}
		
	}
}