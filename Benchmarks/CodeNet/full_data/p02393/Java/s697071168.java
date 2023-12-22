import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<integer> input = new ArrayList<Integer>();
		while(sc.hasNextInt){
			input.add(sc.nextInt);
		}
		while(input.get(0)<input.get(1) || input.get(1)<input.get(2)){
			int store;
			if(input.get(0)>input.get(1)){
				store=input.get(0);
				input.set(0,input.get(1));
				input.set(1,store);
			}
			if(input.get(1)>input.get(2)){
				store=input.get(1);
				input.set(1,input.get(2));
				input.set(2,store);
			}
		}
		System.out.println(input.get(0)+" "+input.get(1)+" "+input.get(2));
	}
}