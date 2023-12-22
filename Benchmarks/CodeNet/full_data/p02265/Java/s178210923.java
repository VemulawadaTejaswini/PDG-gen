import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//ALDS1_1_A(); 
		//ALDS1_2_A();
		//ALDS1_2_B();
		//ALDS1_2_C();
		//ALDS1_2_D();
		//ALDS1_3_A();
		//ALDS1_3_B();
		ALDS1_3_C();
	}

	public static void ALDS1_3_C() {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//LinkedList<Integer> link = new LinkedList<Integer>();
		//Deque<Integer> link = new ArrayDeque<Integer>();
		Deque<String> link = new ArrayDeque<String>();
		StringBuilder ans = new StringBuilder();
		String input_str[] = new String[2];
		try {
			int n = Integer.parseInt(br.readLine());
			//int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				//String command = sc.next();
				input_str = br.readLine().split("\\s+");
				if(input_str[0].equals("insert")) {
					//int x = sc.nextInt();
					//link.addFirst(x);
					link.addFirst(input_str[1]);
				}else if(input_str[0].equals("delete")) {
					//int x = sc.nextInt();
					//link.removeFirstOccurrence(x);
					link.remove(input_str[1]);
				}else if(input_str[0].equals("deleteFirst")) {
					link.removeFirst();
				}else if(input_str[0].equals("deleteLast")) {
					link.removeLast();
				}

				/*
				if(command.equals("insert")) {
					int x = sc.nextInt();
					link.addFirst(x);
				}else if(command.equals("delete")) {
					int x = sc.nextInt();
					link.removeFirstOccurrence(x);
				}else if(command.equals("deleteFirst")) {
					link.removeFirst();
				}else if(command.equals("deleteLast")) {
					link.removeLast();
				}
				 */
			}

			if(!link.isEmpty()) {
				ans.append(link.getFirst());
				link.removeFirst();
			}
			while(!link.isEmpty()) {
				ans.append(" ").append(link.getFirst());
				link.removeFirst();
			}
			System.out.println(ans.toString());
			
			
			/*
			String tmp;
			boolean notFirst = false;
			while((tmp = link.poll()) != null) {
				if(notFirst)
					System.out.print(" ");
				System.out.print(tmp);
				notFirst = true;
			}
			System.out.println();
			*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

