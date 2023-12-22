import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		String[] str;
		String s;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> stack = new ArrayList<String>();
		ArrayList<String> pop = new ArrayList<String>();
		int current = -1;
		
		while(true){
			s = scan.nextLine();
			str = s.split(" ");
			if(str[0].equals("quit")){
				break;
			}else if(str[0].equals("push")){
				stack.add(str[1]);
				current++;
			}if(str[0].equals("pop")){
				pop.add(stack.get(current));
				stack.remove(current);
				current--;
			}
		}
		
		for(String i:pop){
			System.out.println(i);
		}
	}
}