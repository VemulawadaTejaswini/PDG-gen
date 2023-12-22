import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		for(;;){
			String input = scan.next();
			if(input.equals("-")){
				break;
			}
			int m = scan.nextInt();
			int len = input.length();
			String output = input;
			List<Character> listC = new ArrayList<Character>();
			for(int i = 0; i < len; i++){
				char c = output.charAt(i);
				listC.add(c);
			}
			for(int i = 0; i < m; i++){
				int h = scan.nextInt();
				for(int j = 0; j < h; j++){
					char c = listC.get(0);
					listC.remove(0);
					listC.add(c);
				}
			}
			for(char c : listC){
				System.out.print(c);
			}
			System.out.println("");
		}
	}

	
}