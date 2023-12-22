import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		String w = input.next();
		
		while (input.hasNext()){
			String str = input.next();
			if (w.equals(str)) count++;
		}
		
		System.out.println(count);
	}
}