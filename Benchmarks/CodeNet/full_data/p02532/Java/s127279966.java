import java.util.*;

public class Main {
	public static void main(String[] args) {

		ArrayList<ArrayDeque<Character>> color = new ArrayList<ArrayDeque<Character>>();
		ArrayList<Character> result = new ArrayList<Character>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			color.add(new ArrayDeque<Character>());
		}

		String command;		
		while(!((command = sc.next()).equals("quit"))){
			if (command.equals("push")){
				color.get(sc.nextInt() - 1).push(sc.next().charAt(0));
			}else if(command.equals("pop")){
				result.add(color.get(sc.nextInt() - 1).pop());
			} else if(command.equals("move")){
				Character c = color.get(sc.nextInt() - 1).pop();
				color.get(sc.nextInt() - 1).push(c);
			}
		}

		for (Character el : result) {
			System.out.println(el);
		}
	}
}