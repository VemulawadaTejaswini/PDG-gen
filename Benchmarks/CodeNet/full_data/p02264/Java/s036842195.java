import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		Integer number = Integer.parseInt(input.split(" ")[0]);
		Integer quantum = Integer.parseInt(input.split(" ")[1]);
		Integer current_time = 0;
		ArrayList<String> queue = new ArrayList<String>();
		while(s.hasNext()){
			queue.add(s.nextLine());
		}
		s.close();
		
		while(queue.size() > 0){
			String process = queue.remove(0);
			Integer result = get_time(process, quantum);
			if(result <= 0){
				current_time = current_time + quantum + result;
				System.out.println(process.split(" ")[0] + " " + current_time);
			}
			else{
				current_time += quantum;
				String process_result = process.split(" ")[0] + " " + result.toString();
				queue.add(process_result);
			}
		}

	}
	
	private static Integer get_time(String process, Integer quantum){
		Integer time = Integer.parseInt(process.split(" ")[1]);
		return time - quantum;
	}

}