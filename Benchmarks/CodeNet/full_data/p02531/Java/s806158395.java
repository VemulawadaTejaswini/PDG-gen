import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Deque<String> block = new ArrayDeque<>();
		List<String> removeBlock = new ArrayList<>();
		
		while(true) {
			String cmnd = sc.next();
			
			if(cmnd.equals("quit")) {
				break;
			} else if(cmnd.equals("push")) {
				String color = sc.next();
				
				block.addFirst(color);
			} else if(cmnd.equals("pop")) {
				removeBlock.add(block.removeFirst());
			}
		}
		
		for(int i = 0; i < removeBlock.size(); i++) {
			System.out.println(removeBlock.get(i));
		}
	}
}