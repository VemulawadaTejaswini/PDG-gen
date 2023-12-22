mport java.util.*;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static Deque<Integer> list = new ArrayDeque<>();
	public static int len = 0;
	public static void main(String[] args) {
		int i;
		int n = sc.nextInt();
		for(i = 0; i <= n; i++){
			String[] order = (sc.nextLine()).split(" ");
			if(order[0].equals("insert")){
				list.push(Integer.parseInt(order[1]));
			}
			else if(order[0].equals("delete")){
				list.remove(Integer.parseInt(order[1]));
			}
			else if(order[0].equals("deleteFirst")){
				list.removeFirst();
			}
			else if(order[0].equals("deleteLast")){
				list.removeLast();
			}
		}
		StringBuilder builder = new StringBuilder();
        builder.append(list.poll());
        for(int x : list)
        {
            builder.append(" ").append(x);
        }
        System.out.println(builder);
	}
}
